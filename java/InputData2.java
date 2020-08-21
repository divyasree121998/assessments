package vars.practice.com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class InputData2 {

	public static void main(String[] args) {
		
         try {
			FileOutputStream fout=new FileOutputStream("abc.txt",true);
			PrintStream ps=new PrintStream(fout);
			ps.println("welcome to java class");
			System.out.println("END");
		}
         
         catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         catch (IOException e) {
			// TODO: handle exception
        	 e.printStackTrace();
		}
	}

}
