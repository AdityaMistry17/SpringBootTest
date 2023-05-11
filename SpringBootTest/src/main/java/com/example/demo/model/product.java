package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productid;
	@Column(unique = true)
	private String productname;
	@Column(unique = true)
	private String producategory;
	
	@ManyToOne
	@JoinColumn(name = "categoryid")
	private category category;
	
	public product() {
		super();
	}
	
	

	public product(int productid, String productname, String producategory, com.example.demo.model.category category) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.producategory = producategory;
		this.category = category;
	}


	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProducategory() {
		return producategory;
	}
	public void setProducategory(String producategory) {
		this.producategory = producategory;
	}
	
	
}
