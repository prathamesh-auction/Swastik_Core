package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Symmetry;
import com.samyak.swastik.dto.SymmetryInfo;
import com.samyak.swastik.repository.SymmetryRepository;

@Service
public class SymmetryService implements ISymmetry {

	@Autowired
	private SymmetryRepository symmetryRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<SymmetryInfo> get() {
		List<Symmetry> symmetries = symmetryRepository.findAllByActive(true);
		List<SymmetryInfo> symmetryInfos = new ArrayList<>();
		symmetries.forEach(symmetry -> {
			SymmetryInfo symmetryInfo = modelMapper.map(symmetry, SymmetryInfo.class);
			symmetryInfos.add(symmetryInfo);
		});
		return symmetryInfos;
	}

}
