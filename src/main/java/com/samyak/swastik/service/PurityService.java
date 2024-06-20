package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Purity;
import com.samyak.swastik.dto.PurityInfo;
import com.samyak.swastik.repository.PurityRepository;

@Service
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

}
