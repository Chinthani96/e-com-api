package com.cdev.ecomapi.repository;

import com.cdev.ecomapi.model.dao.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Integer> {
}
