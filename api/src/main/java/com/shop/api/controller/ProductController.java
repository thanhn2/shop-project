package com.shop.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.api.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(path = "/index")
    public String index() {
        return "index";
    }
}
