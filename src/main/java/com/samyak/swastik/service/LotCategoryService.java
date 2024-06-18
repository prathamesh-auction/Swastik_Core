package com.samyak.swastik.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.LotCategory;
import com.samyak.swastik.dto.LotCategoryInfo;
import com.samyak.swastik.repository.LotCategoryRepository;

@Service("")
public class LotCategoryService implements ILotCategory {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private LotCategoryRepository lotCategoryRepository;

	@Override
	public List<LotCategoryInfo> get() {
		List<LotCategory> categories = lotCategoryRepository.findAllByActive(true);
		return categories.stream().map(e -> modelMapper.map(e, LotCategoryInfo.class)).toList();
	}

	@Override
	public Optional<LotCategory> getlotCategoryId(String lotCategoryName) {
		Optional<LotCategory> categoryName = lotCategoryRepository.getByActiveAndLotCategoryName(true, lotCategoryName);
		return categoryName;
	}

	
}
