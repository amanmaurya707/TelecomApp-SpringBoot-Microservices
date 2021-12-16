package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.breaker.CustomerCircuit;
import com.customer.dto.CustomerDTO;
import com.customer.dto.LoginDTO;
import com.customer.dto.PlanDTO;
import com.customer.entity.Customer;
import com.customer.service.impl.CustomerServiceImpl;



@RestController
public class CustomerRestController {
	@Autowired
	CustomerServiceImpl service;
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	CustomerCircuit circuit;
	
	private static final String PLAN_URL="http://PLANMS/Plan/{planId}";//http://localhost:1113/Plan/{planId}
	//for creating hystrix//private static final String FRIEND_URL="http://localhost:1114/Friend/{phoneNumber}";
	
	@PostMapping("/register")//by default consumer type is application/json i.e json 
	//client make an request using request body
	//@RequestBody deserialized the json data format to java object
	public boolean addCustomer(@RequestBody Customer customer)
	{
		return service.registerCustomer(customer);
		
	}
	@PostMapping("/login")
	public boolean loginCustomer(@RequestBody LoginDTO loginDTO)
	{
		return service.loginCustomer(loginDTO);
		  
	}
	@GetMapping("/viewProfile/{phoneNumber}")
	public CustomerDTO viewProfile(@PathVariable Long phoneNumber)
	{
	
		CustomerDTO customerDTO=service.viewProfile(phoneNumber);
		PlanDTO planDTO=restTemplate.getForObject(PLAN_URL,PlanDTO.class,customerDTO.getPlanId());
		customerDTO.setCurrentPlan(planDTO);
		//for creating hystrix//
	   // List<Long> friendsContactNumbers=restTemplate.getForObject(FRIEND_URL, List.class, phoneNumber);
		
		List<Long> friendsContactNumbers=circuit.getFriends(phoneNumber);
		customerDTO.setFriendsContactNumbers(friendsContactNumbers);
		return customerDTO;
		
	}

}
