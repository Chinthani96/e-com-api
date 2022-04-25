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
public class Role {
    @Id
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String userRole;
    @Timestamp
    private Date createdAt;
    @Timestamp
    private Date updatedAt;

    public Role(Integer id, String userRole) {
        this.id = id;
        this.userRole = userRole;
    }
}
