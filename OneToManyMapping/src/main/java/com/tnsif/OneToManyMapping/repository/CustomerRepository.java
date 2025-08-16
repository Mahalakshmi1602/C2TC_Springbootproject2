package com.tnsif.OneToManyMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.OneToManyMapping.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}