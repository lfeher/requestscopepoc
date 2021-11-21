package com.lfeher.requestscopepoc.config;

import com.lfeher.requestscopepoc.entity.Customer;
import com.lfeher.requestscopepoc.model.OrganizationData;
import com.lfeher.requestscopepoc.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class AppConfig {

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return args -> {
            repository.save(Customer.builder().name("Jack").build());
            repository.save(Customer.builder().name("Kim").build());
            repository.save(Customer.builder().name("Michelle").build());
        };
    }

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public OrganizationData organizationData() {
        return new OrganizationData();
    }
}
