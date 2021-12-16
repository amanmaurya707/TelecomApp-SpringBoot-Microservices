package com.customer.dto;

import java.util.List;

public class CustomerDTO {
//customer can see profiles with basic details,current plan,friends contacts list.//without showing password 
private Long phoneNumber;
private String username;
private String email;
private String planId;
private PlanDTO currentPlan;//customer micro call plan micro to get plan details
private List<Long> friendsContactNumbers;//customer micro call friend micro to get friends contacts
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
