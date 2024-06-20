package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Shade;
import com.samyak.swastik.dto.ShadeInfo;
import com.samyak.swastik.repository.ShadeRepository;

@Service
public class ShadeService implements IShade {

	@Autowired
	private ShadeRepository shadeRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<ShadeInfo> get() {
		List<Shade> shades = shadeRepository.findAllByActive(true);
		List<ShadeInfo> shadeInfos = new ArrayList<>();
		shades.forEach(shade -> {
			ShadeInfo shadeInfo = modelMapper.map(shade, ShadeInfo.class);
			shadeInfos.add(shadeInfo);
		});
		return shadeInfos;
	}

}
