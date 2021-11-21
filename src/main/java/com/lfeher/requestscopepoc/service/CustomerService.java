package com.lfeher.requestscopepoc.service;

import com.lfeher.requestscopepoc.entity.Customer;
import com.lfeher.requestscopepoc.model.OrganizationData;
import com.lfeher.requestscopepoc.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;
    private final OrganizationData organizationData;

    public CustomerService(CustomerRepository repository, OrganizationData organizationData) {
        this.repository = repository;
        this.organizationData = organizationData;
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Customer getCustomer() {
        return repository.findByName(organizationData.getName());
    }
}
