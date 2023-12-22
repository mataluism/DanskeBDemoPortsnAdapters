package com.luismata.danskebankdemopna.modules.customer.domain.services;

import com.luismata.danskebankdemopna.modules.customer.domain.exceptions.InvalidNameProvidedException;
import com.luismata.danskebankdemopna.modules.customer.domain.model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CustomerServiceTests {

    @Autowired
    private CustomerService customerService;

    @BeforeEach
    void init() {
    }

    @ParameterizedTest
    @ValueSource(strings = {"john", "johnny doe"})
    void givenValidName_whenCallingCreateCustomer_thenNewCustomerCreated(String newCustomerName) {
        // given

        //when
        Customer newCustomer = customerService.createNewCustomer(newCustomerName);

        //then
        assertNotNull(newCustomer);
        assertEquals(newCustomer.getCustomerName(), newCustomerName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"john33", "doe!#$%&/()=?»}"})
    void givenInvalidName_whenCallingCreateCustomer_thenInvalidParametersException(String newCustomerName) {
        // given

        //when
        Exception exception = assertThrows(InvalidNameProvidedException.class, () -> customerService.createNewCustomer(newCustomerName));

        //then
        assertEquals(exception.getMessage(), "Invalid name provided." );
    }

}
