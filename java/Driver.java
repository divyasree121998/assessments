package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class Driver {

	public static void main(String[] args) {
		try
		{
		// external class
		Class.forName("oracle.jdbc.OracleDriver");
		 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");
		System.out.println("connected");
		
		String sql="insert into clg values('103','AIIMS')";
		
		PreparedStatement statement=con.prepareStatement(sql);
		statement.executeUpdate();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		}

		

	}


