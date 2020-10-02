package com.finalprj.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finalprj.demo.dao.ContactDao;
import com.finalprj.demo.model.Contact;



@CrossOrigin
@RestController
public class ContactController {
	
	@Autowired
	ContactDao contactDao;
	

	//search
	@GetMapping(value="contactcust/{emailId}")
	public Contact getContactCust(@PathVariable String emailId)
	{
	return contactDao.getContactCust(emailId);
	
	}
	
	//save or register customer
	@PostMapping(value="contactcust")
	public String saveContactCust(@RequestBody Contact contact)
	{	
		return contactDao.saveContactCust(contact);
	}
	
	@GetMapping(value="contactcust")
	public List<Contact> getAllContactCusts()
	{
		return contactDao.getAllContactCusts();	
	}

	
}
