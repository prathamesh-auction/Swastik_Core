package com.samyak.swastik.service;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.FinancialTransaction;
import com.samyak.swastik.dto.FinancialTransactionInfo;
import com.samyak.swastik.repository.FinancialTransactionRepository;

@Service("")
public class FinancialTransactionService implements IFinancialTransaction {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private FinancialTransactionRepository financialTransactionRepository;

	@Override
	public void save(FinancialTransactionInfo financialTransactionInfo) {
		FinancialTransaction financialTransaction = modelMapper.map(financialTransactionInfo,
				FinancialTransaction.class);
		financialTransaction.setTransactionId(UUID.randomUUID());
		financialTransactionRepository.save(financialTransaction);

	}

	@Override
	public Integer getFinancialTransactionCount() {
		List<FinancialTransaction> count = financialTransactionRepository.findAllByActive(true);
		return count.size();
	}

}
