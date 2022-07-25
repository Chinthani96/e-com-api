package com.cdev.ecomapi.model.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
    private String descriptions;
    @Getter
    @Setter
    private Double price;
    @Getter
    @Setter
    private Integer quantityOnHand;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;

    public Product(Integer id, String name, String description, Double price, Integer quantityOnHand) {
        this.id = id;
        this.name = name;
        this.descriptions = description;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
    }
}
