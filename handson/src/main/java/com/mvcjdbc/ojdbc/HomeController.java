package com.mvcjdbc.ojdbc;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvcjdbc.ojdbc.dao.MyUsersDao;
import com.mvcjdbc.ojdbc.model.MyUsers;

@Controller
public class HomeController {

	@Autowired
	MyUsersDao dao;

	@RequestMapping(value="/test")
	public String home()
	{
	dao.saveUser(new MyUsers("Monkey","pass1"));
	return "home";
	}
	
	@RequestMapping(value = "/get")
	public String getUsers(Model model) {
		ArrayList<MyUsers> myUsers=dao.getUser();
		model.addAttribute("myUsers", myUsers);
		System.out.println(myUsers);
		return "get";
	}

}
