package com.telecomapp.model;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class RegistrationBean {
	//@NotNull
	@NotEmpty
	@Pattern(regexp = "^([+][9][1]|[9][1]|[0]){0,1}([7-9]{1})([0-9]{9})$")//pattern is work only for string type
	//@Length(min=10,max=10)
	private String phoneNumber;
	
	@NotEmpty 
	@Size(min = 8,max=20)
	private String username;

	@NotEmpty
	@Size(min = 8,max=20)
	private String password;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	private String planId;//reg. the selected plan id
	
	private List<PlanDTO> planList;//fetch list of plan dto at cilent side show dropdown for selection of particular plan

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
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

	public List<PlanDTO> getPlanList() {
		return planList;
	}

	public void setPlanList(List<PlanDTO> planList) {
		this.planList = planList;
	}


}
