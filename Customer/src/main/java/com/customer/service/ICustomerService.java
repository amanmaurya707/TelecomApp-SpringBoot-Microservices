package com.customer.service;

import com.customer.dto.CustomerDTO;
import com.customer.dto.LoginDTO;
import com.customer.entity.Customer;

public interface ICustomerService {
	public boolean registerCustomer(Customer customer);//here direct use entity object
	public boolean loginCustomer(LoginDTO loginDTO);//if return true means login success otherwise false.
	public CustomerDTO viewProfile(Long phoneNumber);

}
