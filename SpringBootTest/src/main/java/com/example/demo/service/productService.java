package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.product;


public interface productService {

	String addProduct(product product);
	String updateProduct(product product, Integer productid);
	void deleteProduct(Integer productid);
	product getProductById(Integer productid);
	List<product> getProduct();
}
