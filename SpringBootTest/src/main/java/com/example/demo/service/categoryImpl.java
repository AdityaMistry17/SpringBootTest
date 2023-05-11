package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.category;
import com.example.demo.repository.categoryRepository;
import com.example.demo.service.categoryService;

@Service
public class categoryImpl implements categoryService{

	@Autowired
	private categoryRepository categoryRepo;

	@Override
	public String addCategory(category category) {
		// TODO Auto-generated method stub
		categoryRepo.save(category);
		return "Your category has been successfully stored!!";
	}

	@Override
	public String updateCategory(category category, Integer categoryid) {
		// TODO Auto-generated method stub
		categoryRepo.save(category);
		return "Your category has been successfully stored!!";
	}

	@Override
	public void deleteCategory(Integer categoryid) {
		// TODO Auto-generated method stub
		categoryRepo.deleteById(categoryid);
	}

	@Override
	public category getCategoryById(Integer categoryid) {
		// TODO Auto-generated method stub
		return categoryRepo.findById(categoryid).get();
	}

	@Override
	public List<category> getCategory() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}
}
