package com.plan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Plans")
public class Plan {
	@Id
	@Column(length = 20)
	private String planId;//eg. PLN-598//by default String is varchar/varchar2 type and occupied 255
	@Column(length = 50)//eg:diwali/regular offer
	private String planName;
	private Integer validity;//eg.84 days
	@Column(length = 100)
    private String description;//1.5 GB DATA 100SMS 
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Integer getValidity() {
		return validity;
	}
	public void setValidity(Integer validity) {
		this.validity = validity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
