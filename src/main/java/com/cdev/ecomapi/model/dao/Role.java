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
public class Role {
    @Id
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String userRole;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;

    public Role(Integer id, String userRole) {
        this.id = id;
        this.userRole = userRole;
    }
}
