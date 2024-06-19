package com.samyak.swastik.service;

import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Ledger;
import com.samyak.swastik.dto.LedgerInfo;
import com.samyak.swastik.repository.LedgerRepository;

@Service("")
public class LedgerService implements Iledger {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private LedgerRepository ledgerRepository;

	@Override
	public Ledger save(LedgerInfo ledgerInfo) {
		Ledger ledger = modelMapper.map(ledgerInfo, Ledger.class);
		ledger.setLedgerId(UUID.randomUUID());
		return ledgerRepository.save(ledger);
	}

	@Override
	public Optional<Ledger> getLedgerId(String ledgerName) {
		Optional<Ledger> ledgerName2 = ledgerRepository.findByActiveAndLedgerName(true, ledgerName);
		return ledgerName2;
	}

}
