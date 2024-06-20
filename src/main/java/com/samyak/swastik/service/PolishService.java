package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Polish;
import com.samyak.swastik.dto.PolishInfo;
import com.samyak.swastik.repository.PolishRepository;

@Service
public class PolishService implements IPolish {

	@Autowired
	private PolishRepository polishRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<PolishInfo> get() {
		List<Polish> polishs = polishRepository.findAllByActive(true);
		List<PolishInfo> polishInfos = new ArrayList<>();
		polishs.forEach(polish -> {
			PolishInfo polishInfo = modelMapper.map(polish, PolishInfo.class);
			polishInfos.add(polishInfo);
		});
		return polishInfos;
	}

}
