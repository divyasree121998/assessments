package com.test.cars;

public class studentsMarks {
   void checkmarks(int marks)throws MarksNotFoundException{
	   if(!(marks>=0 && marks<=100))
		   throw new MarksNotFoundException();
	   else {
		System.out.println("given marks " +marks+ " are Valid");
	}
   }

	public static void main(String[] args) {
		
	}

}
