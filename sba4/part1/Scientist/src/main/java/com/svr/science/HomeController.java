package com.svr.science;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.svr.science.Dao.ScientistDao;
import com.svr.science.Model.Scientist;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	ScientistDao dao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "home";
	}
	@RequestMapping(value="save")
	public String datasave(Model model,@ModelAttribute Scientist scientist){
		
		String status=dao.saveScientist(scientist);
		System.out.println(status);
		//System.out.println("out");
		model.addAttribute("status",status);
		return "disp";
}
	@RequestMapping(value="/updatePage")
	public String update()
	{
	return "updatePage";
	}
	String sid=null;

	@RequestMapping(value="/searchforUpdate")
	public String searchForUpdate(Model model,@RequestParam("sid") String Sid)
	{
	
	this.sid=Sid;
	Scientist scientist=dao.getScientistById(Sid);
	System.out.println(scientist);
	model.addAttribute(scientist);
	return "updatePage";
	}


	@RequestMapping(value="/updatedata")
	public String updateData(Model model,@ModelAttribute Scientist scientist)
	{
	scientist.setSid(sid);
	System.out.println(sid);
	String update=dao.updateScientistById(scientist);
	model.addAttribute("update",update);
	return "Udisp";
	}
	@RequestMapping(value="delete")
	public String deletedata(Model model,@RequestParam("sname")String sname) {
		String so=dao.DeleteScientistByName(sname);
		model.addAttribute("sna",so);
		return "dele";
	}
	@RequestMapping(value="/Search")
	public String Search()
	{
	return "Search";
	}
	@RequestMapping(value="Searchbyname")
	public String searchname(Model model,@RequestParam("sname")String sname){
		Scientist st=dao.getScientistByName(sname);
		model.addAttribute("stt",st);
		return "searchdisp";
	}
	@RequestMapping(value="searchid")
	public String searchid(Model model,@RequestParam("sid")String sid) {
		Scientist sti=dao.getScientistById(sid);
		System.out.println(sti);
		model.addAttribute("stti",sti);
		return "searchdispi";
	}
	@RequestMapping(value="/Searchall")
	public String SearchAll(Model model) {
		ArrayList<Scientist>sc=dao.getAll();
		System.out.println(sc);
		model.addAttribute("sci",sc);
		return "searchall";
	}
	
	

}