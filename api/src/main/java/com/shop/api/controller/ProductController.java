package com.shop.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shop.api.entity.Pagination;
import com.shop.api.entity.Product;
import com.shop.api.service.ProductService;

@RestController
@RequestMapping(path = "/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(path = "/search")
    @ResponseBody
    public Object search(@Valid @RequestBody Pagination pagination) {
        var page = PageRequest.of(pagination.getPageNumber(), pagination.getPageSize());
        return productService.findByNameContainingOrderByHotFlgDesc(pagination.getName(), page);
    }

    @PostMapping(path = "/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@Valid @RequestBody Product product) {
        productService.save(product);
    }

}
