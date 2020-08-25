package com.myschool.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myschool.dbutil.DBConnection;
import com.myschool.model.Player;

public class PlayerDao {
	public String generatepId(String pfname,String plname)
	{
		String pId="";
		String seqNum="";
		int seqNumber=0;
		
		try {
		Connection con=DBConnection.getConnect();
			String sql="select playerseq.nextval from dual";
			PreparedStatement statement=con.prepareStatement(sql);
			 
			ResultSet rs=statement.executeQuery();
			
			if(rs.next()) {
			seqNumber=rs.getInt(1);
			} 
		}
	   
	   	catch (Exception e) {
	   	e.printStackTrace();
	   		}
		if(seqNumber<100 && seqNumber>=10)
			seqNum="0"+seqNumber;
		else if(seqNumber<10)
			seqNum="00"+seqNumber;
		else {
			seqNum=""+seqNumber;
		}
		pId=pfname.substring(0,2)+plname.substring(0,2)+seqNum;
	
		return pId;	
	}

	public String saveplayer(Player player) 
	{
		
		try {
			
			Connection con=DBConnection.getConnect();
			String sql="insert into player values(?,?,?,?,?)";
			PreparedStatement stat=con.prepareStatement(sql);
			
			stat.setString(1,generatepId(player.getPfname(), player.getPlname()));
			stat.setString(2, player.getPfname());
			stat.setString(3, player.getPlname());
			
			java.util.Date dob=player.getDob();
			java.sql.Date sqlDob=new java.sql.Date(dob.getTime());
			
			stat.setDate(4, sqlDob);
			
			stat.setInt(5, player.getAge());
		
			int res=stat.executeUpdate();
			if(res>0)
			
			return "player created";
		
		
		} 
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return "player not found";

	}

}
