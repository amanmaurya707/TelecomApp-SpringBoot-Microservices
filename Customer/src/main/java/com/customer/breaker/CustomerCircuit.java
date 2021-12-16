package com.customer.breaker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.customer.feign.FriendFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class CustomerCircuit {
	@Autowired
	FriendFeign friendFeign;
	//RestTemplate restTemplate;
	
	private static final String FRIEND_URL="http://FRIENDMS/Friend/{phoneNumber}";
	//here circuit is open in between customer microservices and friend microservices
	
	@HystrixCommand(fallbackMethod = "getFriendsFallback")//fallback means alternative methods //or return default data if circuit is open //i.e getting default data is better than getting exception
	public List<Long> getFriends(Long phoneNumber)
	{
		//List<Long> friendsContactNumbers=restTemplate.getForObject(FRIEND_URL, List.class, phoneNumber);
		List<Long> friendsContactNumbers=friendFeign.getFriendsData(phoneNumber);
		return friendsContactNumbers;
		
		
	}
	
	public List<Long> getFriendsFallback(Long phoneNumber)//parameter arg must same
	
	{
		return new ArrayList<Long>();
	}
	
	
	


}
