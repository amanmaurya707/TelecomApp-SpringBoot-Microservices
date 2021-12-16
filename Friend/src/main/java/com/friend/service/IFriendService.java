package com.friend.service;

import java.util.List;

import com.friend.entity.Friend;



public interface IFriendService {
	public String addFriendContact(Friend friend);
	public List<Long> readFriendContactList(Long phoneNumber);
	

}
