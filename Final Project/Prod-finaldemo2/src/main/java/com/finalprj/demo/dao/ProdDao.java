
package com.finalprj.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.finalprj.demo.model.Prod;

@Component
public class ProdDao {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public String saveProduct(Prod prod) {
		try {
		
		mongoTemplate.save(prod);
		return "Product Created";
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
		return "Cannot create Product";
	}
	
	
	public List<Prod> getAllProducts() {
		return mongoTemplate.findAll(Prod.class);
	}
	
	
	
	
	public void delete(int prodId) {
		System.out.println(prodId);
		Query query = new Query();
		query.addCriteria(Criteria.where("ProdId").is(prodId));
		mongoTemplate.findAndRemove(query,Prod.class);
	}
	
	public void deleteByPrice(int price) {
		System.out.println(price);
		Query query = new Query();
		query.addCriteria(Criteria.where("price").is(price));
		mongoTemplate.findAndRemove(query,Prod.class);		
	}
	
	
	
	public void deleteByName(String prodName) {
		//System.out.println(name);
		Query query = new Query();
		query.addCriteria(Criteria.where("prodName").is(prodName));
		mongoTemplate.findAndRemove(query,Prod.class);
	}
	
	
	
	
	public Prod getProductById(int prodId)	{
	
		Query query=new Query();
		query.addCriteria(Criteria.where("prodId").is(prodId));
		
		return mongoTemplate.findOne(query,Prod.class);
		
	}
	
	public Prod getProductByPrice(int price)	{
	
		Query query=new Query();
		query.addCriteria(Criteria.where("price").is(price));
		
		return mongoTemplate.findOne(query,Prod.class);
		
	}
	
	public String updateProduct(Prod prod)
	{
		try {
		Query query = new Query();
		//query.addCriteria(Criteria.where("prodId").is(prodId));
		Update update=new Update();
		update.set("Prod", prod);
		mongoTemplate.updateFirst(query, update, Prod.class);
		return "Product Updated";
		}
		catch (Exception e) {
		e.printStackTrace(); }
		
		return "Cannot Update Product";
	}
	
	
	
}




