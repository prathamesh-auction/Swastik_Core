package com.samyak.swastik.service;

import java.util.List;
import java.util.Optional;

import com.samyak.swastik.domain.LotCategory;
import com.samyak.swastik.dto.LotCategoryInfo;

public interface ILotCategory {

	public List<LotCategoryInfo> get();
	
	public Optional<LotCategory> getlotCategoryId(String lotCategoryName);
}
