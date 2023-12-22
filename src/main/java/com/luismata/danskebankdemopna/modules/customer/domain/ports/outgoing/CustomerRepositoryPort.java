package com.luismata.danskebankdemopna.modules.customer.domain.ports.outgoing;

import com.luismata.danskebankdemopna.modules.customer.domain.model.Customer;

public interface CustomerRepositoryPort {
    Customer saveCustomer(Customer customer);
}
