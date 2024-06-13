package com.samyak.swastik.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Lot;
import com.samyak.swastik.dto.LotInfo;
import com.samyak.swastik.repository.LotRepository;

@Service("")
public class LotService implements ILot {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private LotRepository lotRepository;

	@Override
	public List<LotInfo> get() {
		List<Lot> lots = lotRepository.findAllByActive(true);
		return lots.stream().map(e -> modelMapper.map(e, LotInfo.class)).toList();
	}

	@Override
	public List<String> getLotNumber(String lotNo) {
		List<Lot> lots = lotRepository.findTop500ByLotNoStartingWithAndActive(lotNo, true);
		return lots.stream().map(e -> e.getLotNo()).toList();
	}

}
