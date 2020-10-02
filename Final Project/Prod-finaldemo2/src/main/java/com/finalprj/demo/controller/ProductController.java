
package com.finalprj.demo.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finalprj.demo.dao.ProdDao;
import com.finalprj.demo.model.Prod;


@CrossOrigin
@RestController
public class ProductController {
	 
	@Autowired
	ProdDao prodDao;
	
	
	@PostMapping("products")
	public String saveProduct(@RequestBody Prod prod)
	{
		return prodDao.saveProduct(prod);
	}
	
	
	@GetMapping(value="products")
	public List<Prod> getAllRest()
	{
		return prodDao.getAllProducts();	
	}
	
	@DeleteMapping(value="products/{prodId}")
	public void delete(@PathVariable int prodId)
	{
		prodDao.delete(prodId);	
	}
	
	@DeleteMapping(value="prod/{price}")
	public void deleteByPrice(@PathVariable int price)
	{
		prodDao.deleteByPrice(price);	
	}
	
	
	@DeleteMapping(value="prodd/{prodName}")
	public void deleteByPrice(@PathVariable String prodName)
	{
		prodDao.deleteByName(prodName);
	}
	
	
	
	@GetMapping("product/{prodId}")
	public Prod getProductById(@PathVariable int prodId)
	{	
		return prodDao.getProductById(prodId);	
	}
	
	@GetMapping("prod/{price}")
	public Prod getProductByPrice(@PathVariable int price)
	{	
		return prodDao.getProductByPrice(price);	
	}
	
	
	@PutMapping("products")
	public String updateProduct(@RequestBody Prod prod)
	{
		return prodDao.updateProduct(prod);
	}
	
	
	
}



