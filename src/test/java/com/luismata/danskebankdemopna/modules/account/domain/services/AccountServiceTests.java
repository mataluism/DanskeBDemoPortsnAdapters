package com.luismata.danskebankdemopna.modules.account.domain.services;

import com.luismata.danskebankdemopna.modules.account.domain.model.Account;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class AccountServiceTests {

    @Autowired
    private AccountService accountService;

    @ParameterizedTest
    @ValueSource(ints = {1,2})
    void givenValidCustomerId_whenCallingCreateAccount_thenNewAccountCreated(int customerId) {
        // given

        // when
        Account newAccount = accountService.createNewAccount(customerId);
//        Account newAccount = new Account(customerId);

        //then
        assertNotNull(newAccount);
        assertEquals(newAccount.getAccountOwnerCustomerId(), customerId);
    }
}
