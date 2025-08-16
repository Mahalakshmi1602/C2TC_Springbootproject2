package com.tnsif.OneToManyMapping.service;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import com.tnsif.OneToManyMapping.entity.Order;

public interface OrderService {

    // Save a new order
    Order saveOrder(Order order);

    // Get all orders
    List<Order> getAllOrders();

    // Get order by ID
    Order getOrderById(Long id) throws AccountNotFoundException; // Declare the exception

    // Update order by ID
    Order updateOrder(Long id, Order updatedOrder) throws AccountNotFoundException; // Declare the exception

    // Delete order by ID
    boolean deleteOrder(Long id) throws AccountNotFoundException, Exception; // Declare the exception

	Order saveOrder1(Order order);

	Order updateOrder1(Long id, Order updatedOrder) throws AccountNotFoundException;
   }