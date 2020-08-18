package com.test.cars;

public class ExceptionMain {

	public static void main(String[] args) {
	studentsMarks sm = new studentsMarks();
	try {
		sm.checkmarks(120);
	}
catch (Exception e) {
	System.out.println(e);
}
	}

}
