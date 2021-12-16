package com.customer.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dto.CustomerDTO;
import com.customer.dto.LoginDTO;
import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;
import com.customer.service.ICustomerService;
@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	CustomerRepository repo;
	
	 

	@Override
	public boolean registerCustomer(Customer customer) {
		if(repo.existsById(customer.getPhoneNumber())==false)
		{
			repo.save(customer);
			return true;
			
		}
		else
		{
			return false;
		}
		
	
	}

	@Override
	public boolean loginCustomer(LoginDTO loginDTO) {
	if(repo.loginCheck(loginDTO.getPhoneNumber(), loginDTO.getPassword())==1)
	{
		return true;
	}
	else
	{
		return false;
	}
		
	}

	@Override
	public CustomerDTO viewProfile(Long phoneNumber) {
		Customer customer=repo.findById(phoneNumber).get();
		CustomerDTO customerDTO=new CustomerDTO();
		BeanUtils.copyProperties(customer, customerDTO);//copy customer properties values to customerDTO values which feild/properties  is exist 
		return customerDTO;
	}

}
