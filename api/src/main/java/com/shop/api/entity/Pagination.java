package com.shop.api.entity;

import lombok.Data;

@Data
public class Pagination {

    private String name;
    
    private int pageNumber;
    
    private int pageSize;
    
}
