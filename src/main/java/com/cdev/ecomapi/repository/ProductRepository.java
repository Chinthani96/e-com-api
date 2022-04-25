package com.cdev.ecomapi.repository;

import com.cdev.ecomapi.model.dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
