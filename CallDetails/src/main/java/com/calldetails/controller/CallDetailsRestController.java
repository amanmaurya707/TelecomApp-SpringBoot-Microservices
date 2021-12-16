package com.calldetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.calldetails.dto.CallDetailsDTO;
import com.calldetails.service.ICallDetailsService;

@RestController
public class CallDetailsRestController {
	@Autowired
	ICallDetailsService service;
	@GetMapping("/{phoneNumber}")
	//client make request either in Request Body or Request Url
	public  List<CallDetailsDTO> getCallDetailsByPhoneNumber(@PathVariable Long phoneNumber)
	{
		return service.readCallDetails(phoneNumber);
		
	}

}
