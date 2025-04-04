package com.Aniramki.loans.repository;

import com.Aniramki.loans.model.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface LoansRepository extends CrudRepository<Loans, Long> {


    List<Loans> findByCustomerId(int customerId);
}
