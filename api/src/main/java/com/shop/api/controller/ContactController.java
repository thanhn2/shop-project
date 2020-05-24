package com.shop.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.api.service.ContactService;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(path = "/index")
    public String index() {
        return "index";
    }
}
