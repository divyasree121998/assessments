package com.finalprj.demo.model;

	
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Customer {

	   @Id
	   String userName;
	   String password;
	   String email;
	   String name;
	   int age;
	   String gender;
	   String address;

	   
	   
	   public Customer() {}


	   
	   
	   
	   
	public String getUserName() {
	return userName;
	}


	public void setUserName(String userName) {
	this.userName = userName;
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


	public String getName() {
	return name;
	}


	public void setName(String name) {
	this.name = name;
	}


	public int getAge() {
	return age;
	}


	public void setAge(int age) {
	this.age = age;
	}


	public String getGender() {
	return gender;
	}


	public void setGender(String gender) {
	this.gender = gender;
	}


	public String getAddress() {
	return address;
	}


	public void setAddress(String address) {
	this.address = address;
	}


	public Customer(String userName, String password, String email, String name, int age, String gender, String address) {
	super();
	this.userName = userName;
	this.password = password;
	this.email = email;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.address = address;
	}


	@Override
	public String toString() {
	return "Customer [userName=" + userName + ", password=" + password + ", email=" + email + ", name=" + name
	+ ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	};




}
