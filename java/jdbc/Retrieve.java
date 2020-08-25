package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Retrieve {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs", "pass");
			
			String sql="select * from clg";
			PreparedStatement stat=con.prepareStatement(sql);
			
			ResultSet rs=stat.executeQuery();
			rs.next();
			
			//System.out.println(rs.getInt(1)+" "+rs.getString(2));
			System.out.println(rs.getInt("cid")+" "+rs.getString("cname"));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
