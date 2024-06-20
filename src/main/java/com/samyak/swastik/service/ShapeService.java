package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Shape;
import com.samyak.swastik.dto.ShapeInfo;
import com.samyak.swastik.repository.ShapeRepository;

@Service
public class ShapeService implements IShape {

	@Autowired
	private ShapeRepository shapeRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<ShapeInfo> get() {
		List<Shape> shapes = shapeRepository.findAllByActive(true);
		List<ShapeInfo> shapeInfos = new ArrayList<>();
		shapes.forEach(shape -> {
			ShapeInfo shapeInfo = modelMapper.map(shape, ShapeInfo.class);
			shapeInfos.add(shapeInfo);
		});
		return shapeInfos;
	}

}
