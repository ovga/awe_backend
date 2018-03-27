package com.affiliate.websites.repository;

import org.springframework.data.repository.CrudRepository;

import com.affiliate.websites.domain.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
