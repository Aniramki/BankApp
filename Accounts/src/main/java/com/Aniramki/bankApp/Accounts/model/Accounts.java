package com.Aniramki.bankApp.Accounts.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "accounts") // A clear indication of the name of the table
@Getter @Setter @ToString
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID generation database
    @Column(name = "account_number")
    private long accountNumber;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id") // Communication with Customer
    private Customer customer;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "branch_address")
    private String branchAddress;

    @Column(name = "create_dt")
    private LocalDate createDt; // Changed to comply with Date SQL type
}
