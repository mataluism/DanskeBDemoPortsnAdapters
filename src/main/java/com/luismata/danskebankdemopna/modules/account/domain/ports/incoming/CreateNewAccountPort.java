package com.luismata.danskebankdemopna.modules.account.domain.ports.incoming;

import com.luismata.danskebankdemopna.modules.account.domain.model.Account;

public interface CreateNewAccountPort {
    public Account createNewAccount(int accountOwnerCustomerId);
}
