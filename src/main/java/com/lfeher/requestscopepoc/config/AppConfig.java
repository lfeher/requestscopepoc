package com.lfeher.requestscopepoc.config;

import com.lfeher.requestscopepoc.entity.Customer;
import com.lfeher.requestscopepoc.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return args -> {
            repository.save(Customer.builder().name("Jack Bauer").build());
            repository.save(Customer.builder().name("Kim Bauer").build());
            repository.save(Customer.builder().name("Michelle Dessler").build());
        };
    }
}
