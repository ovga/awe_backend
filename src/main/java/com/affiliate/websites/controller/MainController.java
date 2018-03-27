package com.affiliate.websites.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.affiliate.websites.service.CategoryService;
import com.affiliate.websites.service.ProductService;


@Controller
public class MainController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/categories")
	public String showCategories(Model model) {
		return categoryService.findAllCategories(model);
	}

	@RequestMapping(value = "/products")
	public String showProducts(Model model) {
		return productService.findAllProducts(model);
	}
}
