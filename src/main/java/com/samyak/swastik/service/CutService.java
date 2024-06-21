package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Cut;
import com.samyak.swastik.dto.CutInfo;
import com.samyak.swastik.repository.CutRepository;

@Service
public class CutService implements ICut {

	@Autowired
	private CutRepository cutRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<CutInfo> get() {
		List<Cut> cuts = cutRepository.findAllByActive(true);
		List<CutInfo> cutInfos = new ArrayList<>();
		cuts.forEach(cut -> {
			CutInfo cutInfo = modelMapper.map(cut, CutInfo.class);
			cutInfos.add(cutInfo);
		});
		return cutInfos;
	}

	@Override
	public void save(CutInfo cutInfo) {
		Cut cut = modelMapper.map(cutInfo, Cut.class);
		cut.setCutId(UUID.randomUUID());
		cutRepository.save(cut);
		
	}
	
	

}
