package com.hwan.delivery.repository;

import com.hwan.delivery.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Long> {
    public Optional<Account> findByEmail(String var);
}
