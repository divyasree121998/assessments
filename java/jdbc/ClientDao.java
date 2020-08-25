package com.myschool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.myschool.dbutil.DBConnection;
import com.myschool.model.Client;



public class ClientDao {

	public String saveClient(Client client)
	{
		
		try {
			
			Connection con=DBConnection.getConnect();
			String sql="insert into client values(?,?)";
			PreparedStatement stat=con.prepareStatement(sql);
			
			stat.setString(1, client.getCname());
			
			java.util.Date dob=client.getDob();
			java.sql.Date sqlDob=new java.sql.Date(dob.getTime());
			
			stat.setDate(2, sqlDob);
			int res=stat.executeUpdate();
			if(res>0)
				return "client saved";
			
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return "unable to Create client";

	}

}
