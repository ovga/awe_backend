package com.affiliate.websites.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.affiliate.websites.domain.entity.Website;
import com.affiliate.websites.repository.WebsiteRepository;

@Service
public class WebsiteService {

	@Autowired
	private WebsiteRepository websiteRepository;

	public Page<Website> getAllWebsites(Pageable pageable) {
		/*List<Website> websiteList = (List<Website>) websiteRepository.findAll();*/
		Page<Website> websiteList = websiteRepository.findAll(pageable);
		return websiteList;
	}
	
	public Optional<Website> getWebsiteById(Long id) {
		Optional<Website> website = websiteRepository.findById(id);
		return website;
	}
}
