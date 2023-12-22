package com.luismata.danskebankdemopna.modules.customer.infrastructure.adapters;

import com.luismata.danskebankdemopna.modules.customer.domain.model.Customer;
import com.luismata.danskebankdemopna.modules.customer.domain.ports.outgoing.CustomerRepositoryPort;
import com.luismata.danskebankdemopna.modules.customer.infrastructure.repositories.CustomerRepository;

public class CustomerRepositoryAdapter implements CustomerRepositoryPort {

    private final CustomerRepository customerRepository;

    public CustomerRepositoryAdapter(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
