package com.samyak.swastik.service;

import java.util.List;
import java.util.Optional;

import com.samyak.swastik.domain.SalePerson;
import com.samyak.swastik.dto.SalePersonInfo;

public interface ISalePerson {

	public List<SalePersonInfo> get();
	
	public Optional<SalePerson> getSalePersonId(String salesPersonName);
}
