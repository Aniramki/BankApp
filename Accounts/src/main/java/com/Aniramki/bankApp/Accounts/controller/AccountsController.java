package com.Aniramki.bankApp.Accounts.controller;

import com.Aniramki.bankApp.Accounts.model.Accounts;
import com.Aniramki.bankApp.Accounts.model.Customer;
import com.Aniramki.bankApp.Accounts.repository.AccountsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class AccountsController {

    private final AccountsRepository accountsRepository;

    public AccountsController(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    @PostMapping("/account")
    public Accounts getAccountDetails(@RequestBody Customer customer) {
        return accountsRepository.findByCustomer_CustomerId(customer.getCustomerId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Account not found"));
    }
}
