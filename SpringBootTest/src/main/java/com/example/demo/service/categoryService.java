package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.category;


public interface categoryService {

	String addCategory(category category);
	String updateCategory(category category, Integer categoryid);
	void deleteCategory(Integer categoryid);
	category getCategoryById(Integer categoryid);
	List<category> getCategory();
}
