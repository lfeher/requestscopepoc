package com.lfeher.requestscopepoc.repository;

import com.lfeher.requestscopepoc.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByName(String name);
}
