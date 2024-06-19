package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.FinancialTransaction;
import java.util.List;


public interface FinancialTransactionRepository extends JpaRepository<FinancialTransaction, Long> {

	public List<FinancialTransaction> findAllByActive(Boolean active);
}
