package com.shop.api.service;

import java.util.List;

import com.shop.api.entity.Product;

public interface ProductService {

    List<Product> findByNameContaining(String name);

    void save(Product product);

}
