package com.luismata.danskebankdemopna.modules.account.domain.services;

import com.luismata.danskebankdemopna.modules.account.domain.model.Account;
import com.luismata.danskebankdemopna.modules.account.domain.ports.incoming.CreateNewAccountPort;
import com.luismata.danskebankdemopna.modules.account.domain.ports.outgoing.AccountRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountService implements CreateNewAccountPort {

    @Autowired
    private final AccountRepositoryPort accountRepositoryPort;

    public AccountService(AccountRepositoryPort accountRepositoryPort) {
        this.accountRepositoryPort = accountRepositoryPort;
    }

    @Override
    public Account createNewAccount(int accountOwnerCustomerId) {

        return null;
    }
}
