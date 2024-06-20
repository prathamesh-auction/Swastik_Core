package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Size;
import com.samyak.swastik.dto.SizeInfo;
import com.samyak.swastik.repository.SizeRepository;

@Service
public class SizeService implements ISize {

	@Autowired
	private SizeRepository sizeRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<SizeInfo> get() {
		List<Size> sizes = sizeRepository.findAllByActive(true);
		List<SizeInfo> sizeInfos = new ArrayList<>();
		sizes.forEach(size -> {
			SizeInfo sizeInfo = modelMapper.map(size, SizeInfo.class);
			sizeInfos.add(sizeInfo);
		});
		return sizeInfos;
	}

}
