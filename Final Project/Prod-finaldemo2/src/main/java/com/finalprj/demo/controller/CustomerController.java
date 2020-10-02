package com.finalprj.demo.controller;


import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finalprj.demo.dao.CustomerDao;
import com.finalprj.demo.model.Customer;


@CrossOrigin
@RestController
public class CustomerController {

	@Autowired
	CustomerDao customerDao;
	
	//search
	@GetMapping("customer/{userName}")
	public Customer getCustomer(@PathVariable String userName)
	{
	return customerDao.getCustomer(userName);
	
	}
	
	//save or register customer
	@PostMapping("customer")
	public String saveCustomer(@RequestBody Customer customer)
	{	
		return customerDao.saveCustomer(customer);
	}
	
	
	@GetMapping(value="customers")
	public List<Customer> getAllCustomers()
	{
		return customerDao.getAllCustomers();	
	}


}
