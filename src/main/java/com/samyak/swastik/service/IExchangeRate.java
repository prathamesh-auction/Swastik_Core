package com.samyak.swastik.service;

import java.util.List;
import java.util.Optional;

import com.samyak.swastik.dto.ExchangeRateInfo;

public interface IExchangeRate {

	public List<Double> get();

	public ExchangeRateInfo get(String exchangeDate);
}
