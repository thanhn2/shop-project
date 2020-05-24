package com.shop.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.shop.api.entity.Product;
import com.shop.api.exception.BusinessException;
import com.shop.api.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findByNameContaining(String name) {
        try {
            return productRepository.findByNameContaining(name);
        } catch (Exception e) {
            throw new BusinessException("", e, HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void save(Product contact) {
        try {
            productRepository.save(contact);
        } catch (Exception e) {
            throw new BusinessException("", e, HttpStatus.BAD_REQUEST);
        }
    }

}