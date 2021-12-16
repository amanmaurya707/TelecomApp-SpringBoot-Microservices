package com.friend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.friend.entity.Friend;
import com.friend.service.IFriendService;


@RestController
public class FriendRestController {
	@Autowired
	IFriendService service;
	
	@PostMapping("/addFriendContact")
	public String addFriendContact(@RequestBody Friend friend) {
		return service.addFriendContact(friend);
		
	}
	@GetMapping("/{phoneNumber}")//based on customer phone number returns customer's freind list.
	public List<Long> getFriendContacts(@PathVariable Long phoneNumber)//path or uri variable
	{
		return service.readFriendContactList(phoneNumber);
		
	}
	

}
