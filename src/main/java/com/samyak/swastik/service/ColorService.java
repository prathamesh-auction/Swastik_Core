package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Color;
import com.samyak.swastik.dto.ColorInfo;
import com.samyak.swastik.repository.ColorRepository;

@Service("colorService")
public class ColorService implements IColor {

	@Autowired
	private ColorRepository colorRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<ColorInfo> get() {
		List<Color> colors = colorRepository.findAllByActive(true);
		List<ColorInfo> colorInfos = new ArrayList<>();
		colors.forEach(color -> {
			ColorInfo colorInfo = modelMapper.map(color, ColorInfo.class);
			colorInfos.add(colorInfo);
		});
		return colorInfos;
	}

	@Override
	public void save(ColorInfo colorInfo) {
		Color color = modelMapper.map(colorInfo, Color.class);
		color.setColorId(UUID.randomUUID());
		colorRepository.save(color);

	}

}
