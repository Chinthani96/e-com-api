package com.cdev.ecomapi.repository;

import com.cdev.ecomapi.model.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
