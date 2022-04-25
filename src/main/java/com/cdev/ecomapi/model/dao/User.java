package com.cdev.ecomapi.model.dao;

import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@NoArgsConstructor
public class User {
    @Id
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private String email;
    @Getter
    @OneToOne(targetEntity = Role.class, cascade = CascadeType.ALL)
    private Role role;
    @Timestamp
    private Date createdAt;
    @Timestamp
    private Date updatedAt;

    public User(Integer id, String username, String password, String email, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}
