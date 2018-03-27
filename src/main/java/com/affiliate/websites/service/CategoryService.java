package com.affiliate.websites.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.affiliate.websites.domain.entity.Category;
import com.affiliate.websites.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public String findAllCategories(Model model){
				
		List<Category> categories = (List<Category>) categoryRepository.findAll();
		if (categories.isEmpty()) {
			return "empty";
		}
		
		model.addAttribute("categories", categories);
		return "showCategories";
	}
}
