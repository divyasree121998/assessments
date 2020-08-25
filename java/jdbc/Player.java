package com.myschool.model;

import java.util.Date;

public class Player {
	private String pId;
	private String pfname;
	private String plname;
	private Date dob;
	private int age;
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getPfname() {
		return pfname;
	}
	public void setPfname(String pfname) {
		this.pfname = pfname;
	}
	public String getPlname() {
		return plname;
	}
	public void setPlname(String plname) {
		this.plname = plname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Player(String pId, String pfname, String plname, Date dob, int age) {
		super();
		this.pId = pId;
		this.pfname = pfname;
		this.plname = plname;
		this.dob = dob;
		this.age = age;
	}
	
	public Player() 
	{
		
	}
	@Override
	public String toString() {
		return "Player [pId=" + pId + ", pfname=" + pfname + ", plname=" + plname + ", dob=" + dob + ", age=" + age
				+ "]";
	}
	
	}

