package com.store.customer.service;

import java.util.List;

import com.store.customer.repository.entity.Customer;

public interface CustomerService {

    public List<Customer> findCustomerAll();
    public List<Customer> findCustomersByStatus(String status);
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(Customer customer);
    public  Customer getCustomer(Long id);



}
