package com.myapp.ser;

import java.io.Serializable;

public class Student implements Serializable{
		
		private String name;
		private int rollNO;
		private String address;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNO() {
			return rollNO;
		}
		public void setRollNO(int rollNO) {
			this.rollNO = rollNO;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Student(String name, int rollNO, String address) {
			super();
			this.name = name;
			this.rollNO = rollNO;
			this.address = address;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", rollNO=" + rollNO + ", address=" + address + "]";
		}
		
		
}


		