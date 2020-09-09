package com.mvcjdbc.ojdbc.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mvcjdbc.ojdbc.model.MyUsers;

@Component
@Transactional
public class MyUsersDao {

	@Autowired
	SessionFactory sessionFactor;


	public String saveUser(MyUsers myUsers)
	{
	try
	{
	Session session=sessionFactor.getCurrentSession();
	session.save(myUsers);

	return "user created";
	}
	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}

	return "cannot create user";

	}
	
	public ArrayList<MyUsers> getUser() {
		try {
			Session session=sessionFactor.getCurrentSession();
			Query query=session.createQuery("from MyUsers");
			ArrayList<MyUsers> myUsers=(ArrayList<MyUsers>) query.list();
			return myUsers;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
