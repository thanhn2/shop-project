package com.shop.api.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty
    @Size(max=200, message = "Name must be less than 200 characters")
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @NotNull
    @DecimalMin("1.00")
    @Column(name = "price")
    private BigDecimal price;

    @NotNull
    @Column(name = "quantity")
    private Integer quantity;

    @Max(100)
    @Column(name = "discount")
    private Integer discount;

    @Max(1)
    @Column(name = "hot")
    private Integer hot;

}
