package com.Aniramki.bankApp.Accounts.repository;

import com.Aniramki.bankApp.Accounts.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findByCustomer_CustomerId(int customerId);
}

