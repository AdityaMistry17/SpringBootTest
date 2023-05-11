package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.product;
import com.example.demo.repository.productRepository;

@Service
public class productImpl implements productService{

	@Autowired
	private productRepository productRepo;
	
	@Override
	public String addProduct(product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
		return "Product added";
	}

	@Override
	public String updateProduct(product product, Integer productid) {
		// TODO Auto-generated method stub
		productRepo.save(product);
		return "Product Updated";
	}

	@Override
	public void deleteProduct(Integer productid) {
		// TODO Auto-generated method stub
		productRepo.deleteById(productid);
	}

	@Override
	public product getProductById(Integer productid) {
		// TODO Auto-generated method stub
		
		return productRepo.findById(productid).get();
	}

	@Override
	public List<product> getProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	
}
