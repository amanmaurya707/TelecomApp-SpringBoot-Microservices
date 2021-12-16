package com.friend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.friend.entity.Friend;



@Repository
public interface FriendRepository  extends JpaRepository<Friend, Long>{
	//by default jpa provides two query findAll(),findById()
	@Query(value = "select count(*) from friend where phone_no=? and friend_no=?",nativeQuery = true)//both condition is true //if exist then don't add if not then add 
	Integer checkFriendContact(Long phoneNumber,Long friendNumber);//check freind contact no before adding
	@Query(value="select friend_no from friend where phone_no=?",nativeQuery = true)//get partial data use query
	List<Long>   findFriendContactNumber(Long phoneNumber);

}
