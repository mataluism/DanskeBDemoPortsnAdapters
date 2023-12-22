package com.luismata.danskebankdemopna.modules.customer.domain.ports.incoming;

import com.luismata.danskebankdemopna.modules.customer.domain.model.Customer;

public interface CreateNewCustomerPort {
    Customer createNewCustomer(String newCustomerName);
}
