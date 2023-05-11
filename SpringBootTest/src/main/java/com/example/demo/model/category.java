package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int categoryid;
	
	@Column(unique = true)
	private String categoryname;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category", fetch = FetchType.EAGER,targetEntity = product.class)
	private List<product> product;
	
	
	public category() {
		super();
	}
	

	public category(int categoryid, String categoryname, List<com.example.demo.model.product> product) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.product = product;
	}






	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	
}
