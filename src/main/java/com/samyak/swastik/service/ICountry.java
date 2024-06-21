package com.samyak.swastik.service;

import java.util.List;

import com.samyak.swastik.dto.CountryInfo;

public interface ICountry {

	public List<CountryInfo> get();

	public void save(CountryInfo countryInfo);
}
