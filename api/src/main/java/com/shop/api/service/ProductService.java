package com.shop.api.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.shop.api.entity.Product;

public interface ProductService {

    Page<Product> findByNameContainingOrderByHotFlgDesc(String name, Pageable pageable);

    void save(Product product);

}
