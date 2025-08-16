package com.tnsif.OneToManyMapping.service;

import com.tnsif.OneToManyMapping.entity.*;
import com.tnsif.OneToManyMapping.exception.CustomerNotFoundException; // Import the custom exception
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

public interface CustomerService {

    // Save a new customer
    Customer saveCustomer(Customer customer);

    // Get all customers
    List<Customer> getAllCustomers();

    // Get customer by ID
    Customer getCustomerById(Long id) throws AccountNotFoundException; // Declare the exception

    // Update customer by ID
    Customer updateCustomer(Long id, Customer updatedCustomer) throws AccountNotFoundException; // Declare the exception

    // Delete customer by ID
    boolean deleteCustomer(Long id) throws AccountNotFoundException; // Declare the exception

	Customer saveCustomer1(Customer customer);

	Customer updateCustomer1(Long id, Customer updatedCustomer);
}