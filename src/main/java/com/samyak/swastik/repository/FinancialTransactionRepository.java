package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.FinancialTransaction;

public interface FinancialTransactionRepository extends JpaRepository<FinancialTransaction, Long> {

}
