package com.luismata.danskebankdemopna.modules.account.infrastructure.repositories;

import com.luismata.danskebankdemopna.modules.account.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
