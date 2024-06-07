package com.samyak.swastik.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.SalePerson;
import com.samyak.swastik.dto.SalePersonInfo;
import com.samyak.swastik.repository.SalePersonRepository;

@Service("")
public class SalePersonService implements ISalePerson {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private SalePersonRepository salePersonRepository;

	@Override
	public List<SalePersonInfo> get() {
		List<SalePerson> salePerson = salePersonRepository.findAllByActive(true);
		return salePerson.stream().map(e -> modelMapper.map(e, SalePersonInfo.class)).toList();
	}

}
