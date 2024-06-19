package com.samyak.swastik.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.ReceiveTransaction;
import com.samyak.swastik.dto.ReceiveTransactionInfo;
import com.samyak.swastik.repository.ReceiveTransactionRepository;

@Service("")
public class ReceiveTransactionService implements IReceiveTransaction {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private ReceiveTransactionRepository receiveTransactionRepository;

	@Override
	public void save(ReceiveTransactionInfo receiveTransactionInfo) {
		ReceiveTransaction receiveTransaction = modelMapper.map(receiveTransactionInfo, ReceiveTransaction.class);
		receiveTransaction.setReceiveTransactionId(UUID.randomUUID());
		receiveTransactionRepository.save(receiveTransaction);

	}

}
