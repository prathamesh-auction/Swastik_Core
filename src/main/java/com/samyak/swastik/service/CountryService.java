package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Country;
import com.samyak.swastik.dto.CountryInfo;
import com.samyak.swastik.repository.CountryRepository;

@Service
public class CountryService implements ICountry {

	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<CountryInfo> get() {
		List<Country> countries = countryRepository.findAllByActive(true);
		List<CountryInfo> countryInfos = new ArrayList<>();
		countries.forEach(country -> {
			CountryInfo countryInfo = modelMapper.map(country, CountryInfo.class);
			countryInfos.add(countryInfo);
		});
		return countryInfos;
	}

}
