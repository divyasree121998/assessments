package com.svr.science.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Scientist {
  @Id
  String sid;
  String sname;
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Scientist(String sid, String sname) {
	super();
	this.sid = sid;
	this.sname = sname;
}
@Override
public String toString() {
	return "Scientist [sid=" + sid + ", sname=" + sname + "]";
}
  public Scientist() {}
}
