package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Fluorescence;
import com.samyak.swastik.dto.FluorescenceInfo;
import com.samyak.swastik.repository.FluorescenceRepository;

@Service
public class FluorescenceService implements IFluorescence {

	@Autowired
	private FluorescenceRepository fluorescenceRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<FluorescenceInfo> get() {
		List<Fluorescence> fluorescences = fluorescenceRepository.findAllByActive(true);
		List<FluorescenceInfo> fluorescenceInfos = new ArrayList<>();
		fluorescences.forEach(fluorescence -> {
			FluorescenceInfo fluorescenceInfo = modelMapper.map(fluorescence, FluorescenceInfo.class);
			fluorescenceInfos.add(fluorescenceInfo);
		});
		return fluorescenceInfos;
	}

}
