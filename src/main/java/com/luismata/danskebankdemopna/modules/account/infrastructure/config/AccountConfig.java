package com.luismata.danskebankdemopna.modules.account.infrastructure.config;

import com.luismata.danskebankdemopna.modules.account.domain.ports.incoming.CreateNewAccountPort;
import com.luismata.danskebankdemopna.modules.account.domain.ports.outgoing.AccountRepositoryPort;
import com.luismata.danskebankdemopna.modules.account.domain.services.AccountService;
import com.luismata.danskebankdemopna.modules.account.infrastructure.adapters.AccountRepositoryAdapter;
import com.luismata.danskebankdemopna.modules.account.infrastructure.repositories.AccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfig {

    @Bean
    public CreateNewAccountPort createNewAccountPort(AccountRepositoryPort accountRepositoryPort) {
        return new AccountService(accountRepositoryPort);
    }

    @Bean
    public AccountRepositoryPort accountRepositoryPort(AccountRepository accountRepository){
        return new AccountRepositoryAdapter(accountRepository);
    }

}
