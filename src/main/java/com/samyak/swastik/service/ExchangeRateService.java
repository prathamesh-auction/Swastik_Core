package com.samyak.swastik.service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	public List<Double> get() {
		List<ExchangeRate> exchangeRates = exchangeRateRepository.findAllByActive(true);
		return exchangeRates.stream().map(e -> e.getExchangeRate()).collect(Collectors.toList());

	}

	@Override
	public ExchangeRateInfo get(String exchangeDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = dateFormat.parse(exchangeDate);
			Timestamp exchangeDate1 = new Timestamp(date.getTime());
			Optional<ExchangeRate> exchangeRate = exchangeRateRepository.findAllByActiveAndExchangeDate(true,
					exchangeDate1);
			if (exchangeRate.isPresent()) {
				ExchangeRate exchangeRate1 = exchangeRate.get();
				return modelMapper.map(exchangeRate1, ExchangeRateInfo.class);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return null;
	}

}
