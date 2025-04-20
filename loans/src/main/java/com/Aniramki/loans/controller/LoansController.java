package com.Aniramki.loans.controller;

import com.Aniramki.loans.config.LoansServiceConfig;
import com.Aniramki.loans.model.Customer;
import com.Aniramki.loans.model.Loans;
import com.Aniramki.loans.model.Properties;
import com.Aniramki.loans.repository.LoansRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController

public class LoansController {

    @Autowired
    private LoansRepository loansRepository;

    @Autowired
    private LoansServiceConfig loansServiceConfig;


    @PostMapping("/myLoans")
    public List<Loans> getLoanDetails(@RequestBody Customer customer) {
        List<Loans> loansList = loansRepository.findByCustomerId(customer.getCustomerId());
        return loansList != null ? loansList : Collections.emptyList();
    }

    @GetMapping("/loan/properties")
    public Properties getPropertyDetails() throws JsonProcessingException {
        Properties properties;
        properties = new Properties(loansServiceConfig.getMsg(), loansServiceConfig.getBuildVersion(), loansServiceConfig.getMailDetails(), loansServiceConfig.getActiveBranches());
        return properties;
    }
}

