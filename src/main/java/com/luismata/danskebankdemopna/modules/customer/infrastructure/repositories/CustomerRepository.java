package com.luismata.danskebankdemopna.modules.customer.infrastructure.repositories;

import com.luismata.danskebankdemopna.modules.customer.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
