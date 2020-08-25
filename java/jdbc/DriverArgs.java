package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DriverArgs {

	public static void main(String[] args) {
		try {
			
		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs", "pass");
		
		String sql="insert into clg1 values(?,?)";
		
		PreparedStatement stat=con.prepareStatement(sql);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter clgid,clgname");
		
		int CID=sc.nextInt();
		String CNAME=sc.next();
		
		stat.setInt(1, CID);
		stat.setString(2, CNAME);
		
		stat.executeUpdate();
		
		System.out.println("inserted");
		
		}
		
		catch (Exception e) {
		e.printStackTrace();
		}
		
		}
}


