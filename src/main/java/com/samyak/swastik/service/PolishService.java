package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Polish;
import com.samyak.swastik.dto.PolishInfo;
import com.samyak.swastik.repository.PolishRepository;

@Service("polishService")
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

	@Override
	public void save(PolishInfo polishInfo) {
		Polish polish = modelMapper.map(polishInfo, Polish.class);
		polish.setPolishId(UUID.randomUUID());
		polishRepository.save(polish);

	}

}
