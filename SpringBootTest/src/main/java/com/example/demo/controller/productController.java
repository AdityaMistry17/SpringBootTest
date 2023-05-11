package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.product;
import com.example.demo.service.productService;

@RestController
@RequestMapping("/api/")
public class productController {

	@Autowired
	private productService service;
	
	@PostMapping("/product/")
	public String addProduct(@RequestBody product product) {
		
		return service.addProduct(product);
	}
	
	@PutMapping("/product/{productid}")
	public String updateProduct(@RequestBody product product , @PathVariable Integer productid)
	{
		String updateProduct = this.service.updateProduct(product, productid);
		return updateProduct;
	}
	
	@DeleteMapping("/product/{productid}")
	public String deleteProduct(@PathVariable Integer productid)
	{
		service.deleteProduct(productid);
		
		return "Product delete succesfully!!";
	}
	
	@GetMapping("product/{productid}")
	public product getProductById( @PathVariable Integer productid)
	{
		product productById = service.getProductById(productid);
		
		return productById;
	}
	
	@GetMapping("/product")
	public List<product> getProductList(
		
	)

	{
		List<product> productlist = service.getProduct();
		return productlist;
	}
}
