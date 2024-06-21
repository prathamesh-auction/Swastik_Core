package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.BlackInclusion;
import com.samyak.swastik.dto.BlackInclusionInfo;
import com.samyak.swastik.repository.BlackInclusionRepository;

@Service("blackInclusionService")
public class BlackInclusionService implements IBlackInclusion {

	@Autowired
	private BlackInclusionRepository blackInclusionRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<BlackInclusionInfo> get() {
		List<BlackInclusion> blackInclusions = blackInclusionRepository.findAllByActive(true);
		List<BlackInclusionInfo> blackInclusionInfos = new ArrayList<>();
		blackInclusions.forEach(blackInclusion -> {
			BlackInclusionInfo blackInclusionInfo = modelMapper.map(blackInclusion, BlackInclusionInfo.class);
			blackInclusionInfos.add(blackInclusionInfo);
		});

		return blackInclusionInfos;
	}

	@Override
	public void save(BlackInclusionInfo blackInclusionInfo) {
		BlackInclusion blackInclusion = modelMapper.map(blackInclusionInfo, BlackInclusion.class);
		blackInclusion.setBlackInclusionId(UUID.randomUUID());
		blackInclusionRepository.save(blackInclusion);

	}

}
