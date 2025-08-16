package com.tnsif.OneToManyMapping.service;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.OneToManyMapping.entity.Order;
import com.tnsif.OneToManyMapping.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Save a new order
    @Override
    public Order saveOrder1(Order order) {
        return orderRepository.save(order);
    }

    // Get all orders
    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get order by ID
    @Override
    public Order getOrderById(Long id) throws AccountNotFoundException {
        return orderRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException("Order not found with ID: " + id)); // Pass custom message
    }

    // Update order by ID
    @Override
    public Order updateOrder1(Long id, Order updatedOrder) throws AccountNotFoundException {
        Order existingOrder = orderRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException("Order not found with ID: " + id)); // Pass custom message

        // Update order fields
        existingOrder.setProduct(updatedOrder.getProduct());

        return orderRepository.save(existingOrder);
    }

    // Delete order by ID
    @Override
    public boolean deleteOrder(Long id) throws Exception {
        if (!orderRepository.existsById(id)) {
            throw new Exception("Order not found with ID: " + id); // Pass custom message
        }
        orderRepository.deleteById(id);
        return true;
    }

	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateOrder(Long id, Order updatedOrder) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
