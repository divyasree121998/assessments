package com.myschool.model;

import java.util.Date;

public class Client {
	private String cname;
	private Date dob;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Client(String cname, Date dob) {
		super();
		this.cname = cname;
		this.dob = dob;
	}
	
	public Client()
	{
		
	}
	@Override
	public String toString() {
		return "client [cname=" + cname + ", dob=" + dob + "]";
	}
	
	

}
