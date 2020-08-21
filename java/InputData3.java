package vars.practice.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputData3 {

	public static void main(String[] args) {
	
	
		try {
			FileReader rd = new FileReader("abc.txt");
			BufferedReader br=new BufferedReader(rd);
		while (true) {	
			System.out.println(br.readLine());
		}
		} 
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
	}


