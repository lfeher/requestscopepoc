package com.lfeher.requestscopepoc.controller;

import com.lfeher.requestscopepoc.entity.Customer;
import com.lfeher.requestscopepoc.model.OrganizationData;
import com.lfeher.requestscopepoc.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/all-customer")
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/customer")
    public Customer getCustomer() {
        final Customer customer = service.getCustomer();
        log.info("[service] customer: {}", customer.getName());
        return customer;
    }
}
