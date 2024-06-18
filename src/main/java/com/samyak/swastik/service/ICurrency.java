package com.samyak.swastik.service;

import java.util.List;
import java.util.UUID;

import com.samyak.swastik.dto.CurrencyInfo;

public interface ICurrency {

	public void save(CurrencyInfo currencyInfo);
	public List<CurrencyInfo> get();
	public UUID getCurrencyId(String currencyName);
}
