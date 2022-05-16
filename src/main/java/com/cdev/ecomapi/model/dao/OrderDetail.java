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
public class OrderDetail {
    @Id
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private Integer orderId;
    @Getter
    @Setter
    private Integer quantity;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;

    public OrderDetail(Integer id, Integer orderId, Integer quantity) {
        this.id = id;
        this.orderId = orderId;
        this.quantity = quantity;
    }
}
