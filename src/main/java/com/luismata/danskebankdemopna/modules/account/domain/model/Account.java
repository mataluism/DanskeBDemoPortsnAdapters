package com.luismata.danskebankdemopna.modules.account.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;
    private int accountOwnerCustomerId;
    private long balance;

    public Account(int accountOwnerCustomerId) {
        this.accountOwnerCustomerId = accountOwnerCustomerId;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getAccountOwnerCustomerId() {
        return accountOwnerCustomerId;
    }

    public void setAccountOwnerCustomerId(int accountOwnerCustomerId) {
        this.accountOwnerCustomerId = accountOwnerCustomerId;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
