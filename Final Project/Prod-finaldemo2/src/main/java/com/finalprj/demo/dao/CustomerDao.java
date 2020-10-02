package com.finalprj.demo.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.finalprj.demo.model.Customer;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;




@Component
public class CustomerDao {

	@Autowired
	MongoTemplate mongoTemplate;
	
	
	
	//for registering the new user
	public String saveCustomer(Customer customer)
	{
	try
	{
	
	mongoTemplate.save(customer);
	return "customer Saved";
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	return "Customer not saved";
	}
	
	//for getting the individual customer record
	
	public Customer getCustomer(String userName)
	{
	
	Query query=new Query();
	query.addCriteria(Criteria.where("userName").is(userName));
	
	return mongoTemplate.findOne(query,Customer.class);
	
	}


	public List<Customer> getAllCustomers() {
		return mongoTemplate.findAll(Customer.class);
	}
	


}