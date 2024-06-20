package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.CutHS;
import com.samyak.swastik.dto.CutHSInfo;
import com.samyak.swastik.repository.CutHSRepository;

@Service
public class CutHSService implements ICutHS {

	@Autowired
	private CutHSRepository cutHSRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<CutHSInfo> get() {
		List<CutHS> cutHSs = cutHSRepository.findAllByActive(true);
		List<CutHSInfo> cutHSInfos = new ArrayList<>();
		cutHSs.forEach(cutHS -> {
			CutHSInfo cutHSInfo = modelMapper.map(cutHS, CutHSInfo.class);
			cutHSInfos.add(cutHSInfo);
		});
		return cutHSInfos;
	}

}
