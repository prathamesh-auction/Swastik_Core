package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.CutEX;
import com.samyak.swastik.dto.CutEXInfo;
import com.samyak.swastik.repository.CutEXRepository;

@Service("cutEXService")
public class CutEXService implements ICutEX {

	@Autowired
	private CutEXRepository cutEXRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<CutEXInfo> get() {
		List<CutEX> cutEXs = cutEXRepository.findAllByActive(true);
		List<CutEXInfo> cutEXInfos = new ArrayList<>();
		cutEXs.forEach(cutEX -> {
			CutEXInfo cutEXInfo = modelMapper.map(cutEX, CutEXInfo.class);
			cutEXInfos.add(cutEXInfo);
		});
		return cutEXInfos;
	}

	@Override
	public void save(CutEXInfo cutEXInfo) {
		CutEX cutEX = modelMapper.map(cutEXInfo, CutEX.class);
		cutEX.setCutEXId(UUID.randomUUID());
		cutEXRepository.save(cutEX);

	}

}
