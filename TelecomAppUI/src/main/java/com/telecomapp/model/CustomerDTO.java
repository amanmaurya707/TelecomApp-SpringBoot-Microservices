package com.telecomapp.model;

import java.util.List;

public class CustomerDTO {
	//here data is comes with multiple microservices
	private Long phoneNumber;//username
	private String username;
	private String email;
	private String planId;
	private PlanDTO currentPlan;
	private List<Long> friendsContactNumbers;
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
	public PlanDTO getCurrentPlan() {
		return currentPlan;
	}
	public void setCurrentPlan(PlanDTO currentPlan) {
		this.currentPlan = currentPlan;
	}
	public List<Long> getFriendsContactNumbers() {
		return friendsContactNumbers;
	}
	public void setFriendsContactNumbers(List<Long> friendsContactNumbers) {
		this.friendsContactNumbers = friendsContactNumbers;
	}
	
		
}
