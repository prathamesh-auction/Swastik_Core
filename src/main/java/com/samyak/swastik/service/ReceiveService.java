package com.samyak.swastik.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Receive;
import com.samyak.swastik.dto.ReceiveInfo;
import com.samyak.swastik.repository.ReceiveRepository;

@Service("")
public class ReceiveService implements IReceive {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private ReceiveRepository receiveRepository;

	@Override
	public Receive save(ReceiveInfo receiveInfo) {
		Receive receive = modelMapper.map(receiveInfo, Receive.class);
		receive.setReceiveId(UUID.randomUUID());
		return receiveRepository.save(receive);

	}

}
