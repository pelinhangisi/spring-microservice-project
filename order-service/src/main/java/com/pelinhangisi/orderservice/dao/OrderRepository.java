package com.pelinhangisi.orderservice.dao;

import com.pelinhangisi.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
