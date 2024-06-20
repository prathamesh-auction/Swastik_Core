package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.OriginColor;
import com.samyak.swastik.dto.OriginColorInfo;
import com.samyak.swastik.repository.OriginColorRepository;

@Service
public class OriginColorService implements IOriginColor {

	@Autowired
	private OriginColorRepository originColorRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<OriginColorInfo> get() {
		List<OriginColor> originColors = originColorRepository.findAllByActive(true);
		List<OriginColorInfo> originColorInfos = new ArrayList<>();
		originColors.forEach(originColor -> {
			OriginColorInfo originColorInfo = modelMapper.map(originColor, OriginColorInfo.class);
			originColorInfos.add(originColorInfo);
		});
		return originColorInfos;
	}

}
