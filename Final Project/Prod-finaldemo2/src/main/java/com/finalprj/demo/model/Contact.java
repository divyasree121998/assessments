package com.finalprj.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contact {

	String firstName;
	String lastName;
	@Id
	String emailId;
	int phoneNumber;
	String message;
	
	public String getFirstName() {
	return firstName;
	}
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
	public String getLastName() {
	return lastName;
	}
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}
	public String getEmailId() {
	return emailId;
	}
	public void setEmailId(String emailId) {
	this.emailId = emailId;
	}
	public int getPhoneNumber() {
	return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
	}

	public String getMessage() {
	return message;
	}
	public void setMessage(String message) {
	this.message = message;
	}
	public Contact(String firstName, String lastName, String emailId, int phoneNumber, String message) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.phoneNumber = phoneNumber;
	this.message = message;
	}
	@Override
	public String toString() {
	return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", phoneNumber="
	+ phoneNumber + ", message=" + message + "]";
	}
	
	public Contact()
	{
	}


}
