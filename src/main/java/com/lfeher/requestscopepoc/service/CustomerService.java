package com.lfeher.requestscopepoc.service;

import com.lfeher.requestscopepoc.entity.Customer;
import com.lfeher.requestscopepoc.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Customer getCustomer(String name) {
        return repository.findByName(name);
    }
}
