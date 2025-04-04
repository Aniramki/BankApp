package com.Aniramki.bankApp.Accounts.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Getter @Setter @ToString
@Table(name = "customer") // clear indication of the name of the table
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Optimal for H2
    @Column(name = "customer_id")
    private int customerId;

    private String name;
    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "create_dt")
    private LocalDate createDt; // Changed to LocalDate (corresponds to SQL)
}

