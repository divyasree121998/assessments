package com.myapp.ser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerClass {

	public static void main(String[] args) {
     try {	
     Student student=new Student("RAJU", 100, "INDIA");
     System.out.println(student);
		FileOutputStream fout=new FileOutputStream("student.ser");
	    
		
			ObjectOutputStream ostr=new ObjectOutputStream(fout);
		     ostr.writeObject(student);
		     System.out.println("done");
     }
		
		catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
