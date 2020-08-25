package com.myschool.service;

import com.myschool.dao.PlayerDao;
import com.myschool.model.Player;

public class PlayerService {
	
public static void main(String[] args) {

	Player player=new Player("", "Virat", "kohli",new java.util.Date(), 32);
	
	PlayerDao dao=new PlayerDao();
	String res= dao.saveplayer(player);
	System.out.println(res);
}
}