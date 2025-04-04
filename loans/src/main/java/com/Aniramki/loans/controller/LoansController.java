package com.Aniramki.loans.controller;

import com.Aniramki.loans.model.Customer;
import com.Aniramki.loans.model.Loans;
import com.Aniramki.loans.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoansController {

    @Autowired
    private LoansRepository loansRepository;


    @PostMapping("/myLoans")
    public List<Loans> getLoanDetails(@RequestBody Customer customer) {
        List<Loans> loansList = loansRepository.findByCustomerId(customer.getCustomerId());
        return loansList != null ? loansList : Collections.emptyList();
    }
}

