package com.luismata.danskebankdemopna.modules.account.application.controllers;

import com.luismata.danskebankdemopna.modules.account.domain.ports.incoming.CreateNewAccountPort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final CreateNewAccountPort createNewAccountPort;

    public AccountController(CreateNewAccountPort createNewAccountPort) {
        this.createNewAccountPort = createNewAccountPort;
    }

    @PostMapping("/create-new-account")
    public int createNewAccount(@RequestParam int customerId) {
        return 0;
    }
}
