package com.luismata.danskebankdemopna.modules.account.domain.ports.outgoing;

import com.luismata.danskebankdemopna.modules.account.domain.model.Account;

public interface AccountRepositoryPort {
    Account saveAccount(Account account);
}
