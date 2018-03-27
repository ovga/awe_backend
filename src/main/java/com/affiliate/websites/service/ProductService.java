package com.affiliate.websites.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.affiliate.websites.domain.entity.Product;
import com.affiliate.websites.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public String findAllProducts(Model model) {
		List<Product> products = (List<Product>) productRepository.findAll();

		if (products.isEmpty()) {
			return "empty";
		}

		model.addAttribute("products", products);
		return "showProducts";
	}
}
