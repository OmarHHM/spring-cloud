package com.store.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.customer.repository.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Long> {
        public Customer findByEmail(String email);
        public List<Customer> findByLastName(String lastName);
        public List<Customer> findByStatus(String status);
}
