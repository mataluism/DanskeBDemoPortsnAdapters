package com.luismata.danskebankdemopna.modules.customer.domain.services;

import com.luismata.danskebankdemopna.modules.customer.domain.exceptions.InvalidNameProvidedException;
import com.luismata.danskebankdemopna.modules.customer.domain.model.Customer;
import com.luismata.danskebankdemopna.modules.customer.domain.ports.incoming.CreateNewCustomerPort;
import com.luismata.danskebankdemopna.modules.customer.domain.ports.outgoing.CustomerRepositoryPort;

public class CustomerService implements CreateNewCustomerPort {

    private final CustomerRepositoryPort customerRepositoryPort;

    public CustomerService(CustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }

    @Override
    public Customer createNewCustomer(String newCustomerName) {
        if(!isValidCustomerName(newCustomerName)) {
            throw new InvalidNameProvidedException("Invalid name provided.");
        }

        Customer newCustomer = new Customer(newCustomerName);

        return customerRepositoryPort.saveCustomer(newCustomer);
    }

    private boolean isValidCustomerName(String name) {
        return Customer.VALID_NAME_CHARACTERS_REGEX.matcher(name).matches();
    }
}
