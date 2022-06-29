package com.pelinhangisi.orderservice.dao;

import com.pelinhangisi.orderservice.model.Orderr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orderr, Long> {
}
