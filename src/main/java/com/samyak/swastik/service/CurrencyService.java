package com.samyak.swastik.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Currency;
import com.samyak.swastik.dto.CurrencyInfo;
import com.samyak.swastik.repository.CurrencyRepository;

@Service("")
public class CurrencyService implements ICurrency {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private CurrencyRepository currencyRepository;

	@Override
	public List<CurrencyInfo> get() {
		List<Currency> currencies = currencyRepository.findAllByActive(true);
		return currencies.stream().map(e -> modelMapper.map(e, CurrencyInfo.class)).toList();
	}

}
