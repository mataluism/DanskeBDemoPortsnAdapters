package com.luismata.danskebankdemopna.modules.account.infrastructure.adapters;

import com.luismata.danskebankdemopna.modules.account.domain.model.Account;
import com.luismata.danskebankdemopna.modules.account.domain.ports.outgoing.AccountRepositoryPort;
import com.luismata.danskebankdemopna.modules.account.infrastructure.repositories.AccountRepository;

public class AccountRepositoryAdapter implements AccountRepositoryPort {

    private final AccountRepository accountRepository;

    public AccountRepositoryAdapter(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
}
