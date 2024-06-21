package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Purity;
import com.samyak.swastik.dto.PurityInfo;
import com.samyak.swastik.repository.PurityRepository;

@Service("purityService")
public class PurityService implements IPurity {

	@Autowired
	private PurityRepository purityRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<PurityInfo> get() {
		List<Purity> purities = purityRepository.findAllByActive(true);
		List<PurityInfo> purityInfos = new ArrayList<>();
		purities.forEach(purity -> {
			PurityInfo purityInfo = modelMapper.map(purity, PurityInfo.class);
			purityInfos.add(purityInfo);
		});
		return purityInfos;
	}

	@Override
	public void save(PurityInfo purityInfo) {
		Purity purity = modelMapper.map(purityInfo, Purity.class);
		purity.setPurityId(UUID.randomUUID());
		purityRepository.save(purity);

	}

}
