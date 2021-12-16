package com.telecomapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.telecomapp.model.CallDetailsDTO;
import com.telecomapp.model.CustomerDTO;
import com.telecomapp.model.FriendDTO;

import com.telecomapp.model.LoginDTO;
import com.telecomapp.model.PlanDTO;
import com.telecomapp.model.RegistrationBean;

import ch.qos.logback.classic.Logger;

@Controller
//@RequestMapping("/TelecomApp")
public class TelecomAppController {
@Autowired
RestTemplate  restTemplate;

//Request URL-login
//if added api gateway then it is necessory to make first request to gateway then gateway forward the request to appropriate microservices.
private static String LOGIN_URL="http://localhost:2113/c/Customer/login";//existing user can login

//Request URL-register
private static String REGISTER_URL="http://localhost:2113/c/Customer/register";//customer must reg with plan //new user must reg with plan

//Request URL- view profile
private static String PROFILE_URL="http://localhost:2113/c/Customer/viewProfile/{phoneNumber}";//customer can see own profile

//Request URL-all plans
private static String ALLPLANS_URL="http://localhost:2113/p/Plan/browsePlan";//customer can see all plans

//Request URL-call details
private static String CALLDETAILS_URL="http://localhost:2113/cd/CallDetails/{phoneNumber}";//customer can view own call details

//Request URL-add friend
private static String FRIEND_URL="http://localhost:2113/f/Friend/addFriendContact"; //customer can view friends contact
	
Logger log=(Logger) LoggerFactory.getLogger(TelecomAppController.class);
@GetMapping({"/Home","/"})
public ModelAndView index()
{
		return new ModelAndView("index");
		
}
@GetMapping("/Login")
public ModelAndView login()
{
	
	return new ModelAndView("login");
	
}

@PostMapping("/loginCheck")
public ModelAndView loginCheck(@RequestParam Long phoneNumber,@RequestParam String password,Model model,HttpServletRequest request)
{  
	LoginDTO login=new LoginDTO();
	login.setPhoneNumber(phoneNumber);
	login.setPassword(password);
	boolean flag=restTemplate.postForObject(LOGIN_URL, login, Boolean.class);
	if(flag==true)
	{
        HttpSession session=request.getSession();
        session.setAttribute("phoneNumber", login.getPhoneNumber());
		return new ModelAndView("user_home");
		
	}
	else
	{
		
		model.addAttribute("message", "Invalid Credentials");
		return new ModelAndView("login");
		
	}
	
	
	
	
}
//call plan ms 
private List<PlanDTO> getPlans()
{
	log.info("getPlans():");
	ParameterizedTypeReference<List<PlanDTO>> typeRef=new ParameterizedTypeReference<List<PlanDTO>>() {};
    ResponseEntity<List<PlanDTO>> response=restTemplate.exchange(ALLPLANS_URL,HttpMethod.GET,null,typeRef);
    log.info(ALLPLANS_URL);
	List<PlanDTO> planDTOList=response.getBody();
	log.info("planDTOList:"+planDTOList);
	return planDTOList;
	
}

@GetMapping("/SignUp")
public ModelAndView registration(Model model)
{
	RegistrationBean registrationBean=new RegistrationBean();
	//call plan ms
	registrationBean.setPlanList(getPlans());
	model.addAttribute("registrationBean", registrationBean);
	return new ModelAndView("registration");	
}
@PostMapping("/registerUser")
public ModelAndView registerUser(@Valid @ModelAttribute RegistrationBean registrationBean,BindingResult result,Model model)
{
	if(result.hasErrors())
	{
		registrationBean.setPlanList(getPlans());
		model.addAttribute("registrationBean", registrationBean);
		return new ModelAndView("registration");
	}
	else
	{
		boolean flag=restTemplate.postForObject(REGISTER_URL, registrationBean, Boolean.class);
		//call customer ms
		if(flag==true)
		{
		 String message="register successfully";
		 model.addAttribute("message",message);	
		 return new ModelAndView("login");
		}
		else
		{
			 String message="already register with this number,try with another";
			 registrationBean.setPlanList(getPlans());
			 model.addAttribute("registrationBean", registrationBean);
			 model.addAttribute("message",message);
		     return new ModelAndView("registration");
		}
	}
	
	
}
@GetMapping("/AboutUs")
public ModelAndView aboutUs()
{
	return new ModelAndView("about_us");
	
}

@GetMapping("/User")
public ModelAndView userHome()
{
	return new ModelAndView("user_home");
	
}
@GetMapping("/Profile")
public ModelAndView userProfile(HttpServletRequest request,Model model)
{
	HttpSession session=request.getSession();
	Long phoneNumber=(Long) session.getAttribute("phoneNumber");
	CustomerDTO customerDTO=restTemplate.getForObject(PROFILE_URL,CustomerDTO.class ,phoneNumber);
	model.addAttribute("customerData",customerDTO);
	return new ModelAndView("profile");
	
}
@GetMapping("/Plans")
public ModelAndView viewPlans(Model model)
{
	ParameterizedTypeReference<List<PlanDTO>> typeRef=new ParameterizedTypeReference<List<PlanDTO>>() {};
    ResponseEntity<List<PlanDTO>> response=restTemplate.exchange(ALLPLANS_URL,HttpMethod.GET,null,typeRef);
	List<PlanDTO> planDTOList=response.getBody();
	model.addAttribute("plansData",planDTOList);
    return new ModelAndView("view_plans");
}

@GetMapping("/CallDetails")
public ModelAndView viewCallDetails(HttpServletRequest request,Model model)
{
	HttpSession session=request.getSession();
	Long phoneNumber=(Long) session.getAttribute("phoneNumber");
	ParameterizedTypeReference<List<CallDetailsDTO>> typeRef=new ParameterizedTypeReference<List<CallDetailsDTO>>() {};
    ResponseEntity<List<CallDetailsDTO>> response=restTemplate.exchange(CALLDETAILS_URL,HttpMethod.GET,null,typeRef,phoneNumber);
	List<CallDetailsDTO> callDetailsDTOList=response.getBody();
	model.addAttribute("callData",callDetailsDTOList);
    return new ModelAndView("view_call_details");
}

@GetMapping("/AddFriendContact")
public ModelAndView addFriendContact()
{
    return new ModelAndView("add_contact");
}
@GetMapping("/AddContact")
public ModelAndView addContact(@RequestParam Long friendNumber,HttpServletRequest request,Model model)
{
	log.info("fine:"+friendNumber);
	HttpSession session=request.getSession();
	Long phoneNumber=(Long) session.getAttribute("phoneNumber");
	FriendDTO friendDTO=new FriendDTO();
	friendDTO.setPhoneNumber(phoneNumber);
	friendDTO.setFriendPhoneNumber(friendNumber);
    String message=restTemplate.postForObject(FRIEND_URL,friendDTO,String.class);
    log.warn(message);
    model.addAttribute("message", message);
    return new ModelAndView("add_contact");
}

@GetMapping("/LogOut")
public ModelAndView logout(Model model,HttpServletRequest request)
{
	HttpSession session=request.getSession();
	session.invalidate();
	model.addAttribute("message", "logout successfully");
	return new ModelAndView("login");
	
}

}
