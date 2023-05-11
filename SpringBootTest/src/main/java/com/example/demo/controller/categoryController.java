package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.category;
import com.example.demo.service.categoryService;

@RestController
public class categoryController {

	@Autowired
private categoryService service;
	
	@PostMapping("/category/")
	public String addCategory(@RequestBody category category) {
		
		return service.addCategory(category);
	}
	
	@PutMapping("/category/{categoryid}")
	public String updateCategory(@RequestBody category category , @PathVariable Integer categoryid)
	{
		String updateCategory = service.updateCategory(category, categoryid);
		return updateCategory;
	}
	
	@DeleteMapping("/category/{categoryid}")
	public String deleteCategory(@PathVariable Integer categoryid)
	{
		service.deleteCategory(categoryid);
		
		return "Category delete succesfully!!";
	}
	
	@GetMapping("category/{categoryid}")
	public category getCategoryById( @PathVariable Integer categoryid)
	{
		category categoryById = service.getCategoryById(categoryid);
		
		return categoryById;
	}
	
	@GetMapping("/category")
	public List<category> getCategoryList(
		@RequestParam(value="pageNumber",defaultValue="0", required = false) Integer pageNumber,
		@RequestParam(value="pageSize",defaultValue="5", required = false) Integer pageSize	      
	)

	{
		List<category> categorylist = service.getCategory();
		return categorylist;
	}
}
