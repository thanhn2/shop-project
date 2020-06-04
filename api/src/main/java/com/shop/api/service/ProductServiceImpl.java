package com.shop.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.shop.api.entity.Product;
import com.shop.api.exception.BusinessException;
import com.shop.api.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Page<Product> findByNameContainingOrderByHotFlgDesc(String name, Pageable pageable) {
        try {
            return productRepository.findByNameContainingOrderByHotFlgDesc(name, pageable);
        } catch (Exception e) {
            throw new BusinessException("Exception search", e);
        }
    }

    @Override
    public void save(Product contact) {
        try {
            productRepository.save(contact);
        } catch (Exception e) {
            throw new BusinessException("Exception add new", e);
        }
    }

}