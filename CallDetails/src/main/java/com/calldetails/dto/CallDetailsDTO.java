package com.calldetails.dto;

import java.util.Date;

public class CallDetailsDTO {
//this is an plain java obj i.e doesn't contain mapping details
private Long callId;
private Long calledBy;//call made by
private Long calledTo;
private Date calledOn;
private Long durationInSeconds;
public Long getCallId() {
	return callId;
}
public void setCallId(Long callId) {
	this.callId = callId;
}
public Long getCalledBy() {
	return calledBy;
}
public void setCalledBy(Long calledBy) {
	this.calledBy = calledBy;
}
public Long getCalledTo() {
	return calledTo;
}
public void setCalledTo(Long calledTo) {
	this.calledTo = calledTo;
}
public Date getCalledOn() {
	return calledOn;
}
public void setCalledOn(Date calledOn) {
	this.calledOn = calledOn;
}
public Long getDurationInSeconds() {
	return durationInSeconds;
}
public void setDurationInSeconds(Long durationInSeconds) {
	this.durationInSeconds = durationInSeconds;
}

}
