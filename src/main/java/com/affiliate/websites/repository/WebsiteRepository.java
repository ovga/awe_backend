package com.affiliate.websites.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.affiliate.websites.domain.entity.Website;

public interface WebsiteRepository extends PagingAndSortingRepository<Website, Long> {
}
