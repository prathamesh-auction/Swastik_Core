package com.samyak.swastik.service;

import java.util.Optional;

import com.samyak.swastik.domain.Ledger;
import com.samyak.swastik.dto.LedgerInfo;

public interface Iledger {

	public Ledger save(LedgerInfo ledgerInfo);
	
	public Optional<Ledger> getLedgerId(String ledgerName);
}
