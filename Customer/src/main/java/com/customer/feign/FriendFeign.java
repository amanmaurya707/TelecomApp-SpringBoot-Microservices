package com.customer.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("FRIENDMS") //feign uses eureka service id OR service name
public interface FriendFeign {
	//define own api based on service endpoint
	//both microservices and feign endpoints must same
	@GetMapping("/Friend/{phoneNumber}")
	public List<Long> getFriendsData(@PathVariable Long phoneNumber); 
	

}
