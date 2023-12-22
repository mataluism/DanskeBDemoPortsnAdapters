package com.luismata.danskebankdemopna.modules.customer.infrastructure.config;

import com.luismata.danskebankdemopna.modules.customer.domain.ports.incoming.CreateNewCustomerPort;
import com.luismata.danskebankdemopna.modules.customer.domain.ports.outgoing.CustomerRepositoryPort;
import com.luismata.danskebankdemopna.modules.customer.domain.services.CustomerService;
import com.luismata.danskebankdemopna.modules.customer.infrastructure.adapters.CustomerRepositoryAdapter;
import com.luismata.danskebankdemopna.modules.customer.infrastructure.repositories.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    @Bean
    public CustomerRepositoryPort customerRepositoryPort(CustomerRepository customerRepository){
        return new CustomerRepositoryAdapter(customerRepository);
    }

    @Bean
    public CreateNewCustomerPort createNewCustomerPort(CustomerRepositoryPort customerRepositoryPort) {
        return new CustomerService(customerRepositoryPort);
    }

}
