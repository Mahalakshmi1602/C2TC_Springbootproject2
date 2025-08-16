package com.tnsif.OneToManyMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.OneToManyMapping.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}