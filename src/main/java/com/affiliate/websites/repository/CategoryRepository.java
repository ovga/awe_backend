package com.affiliate.websites.repository;

import org.springframework.data.repository.CrudRepository;

import com.affiliate.websites.domain.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
