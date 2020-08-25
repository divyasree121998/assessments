package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DrivePara {

	public static void main(String[] args) {
		
		try
		{

		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");

		String sql="insert into clg values(?,?)";

		PreparedStatement stat=con.prepareStatement(sql);
	
		stat.setInt(1, 1054);
		stat.setString(2, "PANJAB University");
		


		stat.executeUpdate();

		System.out.println("inserted");
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		}

		}

