package com.samyak.swastik.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.FinancialTransaction;
import com.samyak.swastik.dto.FInancialTransactionInfo;
import com.samyak.swastik.repository.FinancialTransactionRepository;

@Service("")
public class FinancialTransactionService implements IFinancialTransaction {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private FinancialTransactionRepository financialTransactionRepository;

	@Override
	public void save(FInancialTransactionInfo fInancialTransactionInfo) {
		FinancialTransaction financialTransaction = modelMapper.map(fInancialTransactionInfo,
				FinancialTransaction.class);
		financialTransaction.setTransactionId(UUID.randomUUID());
		financialTransactionRepository.save(financialTransaction);

	}

}
