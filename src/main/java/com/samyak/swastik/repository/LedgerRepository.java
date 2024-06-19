package com.samyak.swastik.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Ledger;


public interface LedgerRepository extends JpaRepository<Ledger, Long> {

	public Optional<Ledger> findByActiveAndLedgerName(Boolean active, String ledgerName);
}
