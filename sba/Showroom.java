package com.test.cars;

import java.util.List;

public class Showroom {
	private String showroomname;
	private int nofcars;
	List<Cars> cars;
	public String getShowroom() {
		return showroomname;
	}
	public void setShowroom(String showroom) {
		this.showroomname = showroom;
	}
	public int getNofcars() {
		return nofcars;
	}
	public void setNofcars(int nofcars) {
		this.nofcars = nofcars;
	}
	public List<Cars> getCars() {
		return cars;
	}
	public void setCars(List<Cars> cars) {
		this.cars = cars;
	}
	public Showroom(String showroom, int nofcars, List<Cars> cars) {
		super();
		this.showroomname = showroom;
		this.nofcars = nofcars;
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Showroom [showroom=" + showroomname + ", nofcars=" + nofcars + ", cars=" + cars + "]";
	}
	
	

}
