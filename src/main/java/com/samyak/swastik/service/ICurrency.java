package com.samyak.swastik.service;

import java.util.List;

import com.samyak.swastik.dto.CurrencyInfo;

public interface ICurrency {

	public void save(CurrencyInfo currencyInfo);
	public List<CurrencyInfo> get();
}
