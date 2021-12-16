package com.friend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="friend")
public class Friend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//based on db pk is generated mysql use AUTO for auto increment and oracle use SEQUENCE
	private Long id;//xampp use IDENTITY type strategy for creating auto increment
	
	@Column(name="PHONE_NO")
	private Long phoneNumber;
	
	@Column(name="FRIEND_NO")
	private Long friendPhoneNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getFriendPhoneNumber() {
		return friendPhoneNumber;
	}

	public void setFriendPhoneNumber(Long friendPhoneNumber) {
		this.friendPhoneNumber = friendPhoneNumber;
	}

	
	

}
