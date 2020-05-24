package com.shop.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.api.entity.Product;
import com.shop.api.exception.BusinessException;
import com.shop.api.service.ProductService;

@RestController
@RequestMapping(path = "/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(path = "/search/{name}")
    @ResponseBody
    public Object search(String name) {
        try {
            return productService.findByNameContaining(name);
        } catch (BusinessException e) {
            return e;
        }
    }

    @RequestMapping(path = "/save")
    @ResponseBody
    public Object save(@RequestBody Product product) {
        try {
            return HttpStatus.CREATED;
        } catch (BusinessException e) {
            return e;
        }
    }

}
