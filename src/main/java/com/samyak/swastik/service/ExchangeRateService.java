package com.samyak.swastik.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.ExchangeRate;
import com.samyak.swastik.dto.ExchangeRateInfo;
import com.samyak.swastik.repository.ExchangeRateRepository;

@Service("")
public class ExchangeRateService implements IExchangeRate {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private ExchangeRateRepository exchangeRateRepository;

	@Override
	public List<ExchangeRateInfo> get() {
		List<ExchangeRate> exchangeRates = exchangeRateRepository.findAllByActive(true);
		return exchangeRates.stream().map(e -> modelMapper.map(e, ExchangeRateInfo.class)).toList();
	}

}
