package com.cdev.ecomapi.model.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@NoArgsConstructor
public class Order {
    @Id
    @Getter
    @Setter
    private Integer id;
    @Getter
    @OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    private User userId;
    @Getter
    @Setter
    private Date orderDate;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;

    public Order(Integer id, User userId, Date orderDate) {
        this.id = id;
        this.userId = userId;
        this.orderDate = orderDate;
    }
}
