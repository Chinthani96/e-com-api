package com.cdev.ecomapi.repository;

import com.cdev.ecomapi.model.dao.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
