package com.cdev.ecomapi.model.dao;

import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@NoArgsConstructor
public class Product {
    @Id
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private Integer quantityOnHand;
    @Timestamp
    private Date createdAt;
    @Timestamp
    private Date updatedAt;

    public Product(Integer id, String name, String description, Integer quantityOnHand) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantityOnHand = quantityOnHand;
    }
}
