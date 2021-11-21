package com.lfeher.requestscopepoc.controller;

import com.lfeher.requestscopepoc.entity.Customer;
import com.lfeher.requestscopepoc.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/all-customer")
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }
}
