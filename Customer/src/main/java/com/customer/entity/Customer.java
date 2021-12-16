package com.customer.entity;

import javax.persistence.*;

@Entity
public class Customer {
	@Id
	@Column(name="PHONE_NO")
	private Long phoneNumber;
	
	@Column(length = 20)
	private String username;
	
	@Column(length = 20)
	private String password;
	
	@Column(length = 100)
	private String email;
	
	@Column(length = 20)
	private String planId; //customer must reg with plan from given dropdown

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	
	

}
