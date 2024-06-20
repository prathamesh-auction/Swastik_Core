package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.OpenInclusion;
import com.samyak.swastik.dto.OpenInclusionInfo;
import com.samyak.swastik.repository.OpenInclusionRepository;

@Service
public class OpenInclusionService implements IOpenInclusion {

	@Autowired
	private OpenInclusionRepository openInclusionRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<OpenInclusionInfo> get() {
		List<OpenInclusion> openInclusions = openInclusionRepository.findAllByActive(true);
		List<OpenInclusionInfo> openInclusionInfos = new ArrayList<>();
		openInclusions.forEach(openInclusion -> {
			OpenInclusionInfo openInclusionInfo = modelMapper.map(openInclusion, OpenInclusionInfo.class);
			openInclusionInfos.add(openInclusionInfo);
		});
		return openInclusionInfos;
	}

}
