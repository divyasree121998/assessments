package vars.practice.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputData4 {
	 
	public static void main(String[] args) {
		 try {
	
			File file=new File("abc.txt");
			FileWriter out=new FileWriter(file,true);
		 	
			out.write("This is new text");
		    System.out.println("done");
		    out.close();
		 
		 	} 
		 catch (FileNotFoundException e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		 	catch (IOException e) {
		// TODO Auto-generated catch block
		 		e.printStackTrace();
		 		}
		
		

	}

}
