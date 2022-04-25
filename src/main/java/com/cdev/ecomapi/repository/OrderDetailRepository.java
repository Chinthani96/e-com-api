package com.cdev.ecomapi.repository;

import com.cdev.ecomapi.model.dao.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
}
