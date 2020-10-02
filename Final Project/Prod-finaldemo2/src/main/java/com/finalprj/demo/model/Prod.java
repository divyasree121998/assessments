package com.finalprj.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document
public class Prod {
	
	@Id
	private int prodId;
	
	private String prodName;
	private int price;
	private String descp;
	private String imgUrl;
	
	
	public String getImgUrl() {
		return imgUrl;
	}

	public Prod(int prodId, String prodName, int price, String descp, String imgUrl) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.descp = descp;
		this.imgUrl = imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

//	public Prod(int prodId, String prodName, int price, String descp) {
//		super();
//		this.prodId = prodId;
//		this.prodName = prodName;
//		this.price = price;
//		this.descp = descp;
//	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescp() {
		return descp;
	}

	public void setDescp(String descp) {
		this.descp = descp;
	}

	@Override
	public String toString() {
		return "Prod [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", descp=" + descp
				+ ", imgUrl=" + imgUrl + "]";
	}
	
	public Prod() {}
	

}
