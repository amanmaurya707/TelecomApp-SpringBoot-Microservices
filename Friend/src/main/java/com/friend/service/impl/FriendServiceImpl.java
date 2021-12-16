package com.friend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friend.entity.Friend;
import com.friend.repository.FriendRepository;
import com.friend.service.IFriendService;


@Service 
public class FriendServiceImpl implements IFriendService {
	@Autowired
	FriendRepository repo;

	@Override
	public String addFriendContact(Friend friend) {
		Integer count=repo.checkFriendContact(friend.getPhoneNumber(),friend.getFriendPhoneNumber());
		if(count==0)
		{
			repo.save(friend);//save() is use only for save entity//saveAndFlush() is use for save and also update.
			return "friend contact is added";
		}
		else
		{
			return "friend contact is already exist";
		}
	
	}

	@Override
	public List<Long> readFriendContactList(Long phoneNumber) {
		return repo.findFriendContactNumber(phoneNumber);
		
	}

}
