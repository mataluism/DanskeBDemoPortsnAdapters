package com.luismata.danskebankdemopna.modules.customer.application.controllers;

import com.luismata.danskebankdemopna.modules.customer.domain.ports.incoming.CreateNewCustomerPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CreateNewCustomerPort createNewCustomerPort;

    public CustomerController(CreateNewCustomerPort createNewCustomerPort) {
        this.createNewCustomerPort = createNewCustomerPort;
    }

    @GetMapping("/check-app")
    public String checkApp() {
        return "Hello from check-app";
    }

    @PostMapping("/create-new-customer")
    public int createNewCustomer(@RequestParam String customerName) {
        return createNewCustomerPort.createNewCustomer(customerName).getCustomerId();
    }

}
