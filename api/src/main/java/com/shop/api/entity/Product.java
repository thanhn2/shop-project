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
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

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
    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "description")
    private String description;

    @NotNull
    @DecimalMin("1.00")
    @Column(name = "price")
    private BigDecimal price;

    @NotNull
    @Min(1)
    @Column(name = "quantity")
    private Integer quantity;

    @Max(100)
    @Column(name = "discount")
    private Integer discount;

    @Pattern(regexp = "0|1")
    @Column(name = "hotFlg")
    private String hotFlg;

}
