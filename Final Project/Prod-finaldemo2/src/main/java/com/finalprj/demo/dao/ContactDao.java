package com.finalprj.demo.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.finalprj.demo.model.Contact;



@Component
public class ContactDao {
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public String saveContactCust(Contact contact) {
	try {
	
	mongoTemplate.save(contact);
	return "Contact Details Saved";
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	
	return "Contact Details is Yet to get Saved";
	}
	
	
	
	 public List<Contact> getAllContactCusts() {
		 return mongoTemplate.findAll(Contact.class);
	 }
	
	
	
	public Contact getContactCust(String emailId)
	{		
		Query query=new Query();
		query.addCriteria(Criteria.where("emailId").is(emailId));
		
		return mongoTemplate.findOne(query,Contact.class);	
	}




	
}
