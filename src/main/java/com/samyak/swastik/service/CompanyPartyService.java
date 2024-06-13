package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.CompanyParty;
import com.samyak.swastik.dto.CompanyPartyInfo;
import com.samyak.swastik.repository.CompanyPartyRepository;

@Service("companyPartyService")
public class CompanyPartyService implements ICompanyParty {

	@Autowired
	private CompanyPartyRepository companyPartyRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<CompanyPartyInfo> get() {
		List<CompanyParty> companyParties = companyPartyRepository.findAllByActive(true);
		List<CompanyPartyInfo> companyPartyInfos = new ArrayList<>();
		companyParties.forEach(companyParty -> {
			CompanyPartyInfo companyPartyInfo = modelMapper.map(companyParty, CompanyPartyInfo.class);
			companyPartyInfos.add(companyPartyInfo);
		});
		return companyPartyInfos;
	}

	@Override
	public void save(CompanyPartyInfo companyPartyInfo) {
		CompanyParty companyParty = modelMapper.map(companyPartyInfo, CompanyParty.class);
		companyParty.setCompanyId(UUID.randomUUID());
		companyPartyRepository.save(companyParty);
	}

	@Override
	public CompanyPartyInfo get(UUID companyPartyId) {
		Optional<CompanyParty> companyParty = companyPartyRepository.getByActiveAndCompanyPartyId(true, companyPartyId);
		if (companyParty.isPresent()) {
			CompanyParty companyParty2 = companyParty.get();
			CompanyPartyInfo companyPartyInfo = modelMapper.map(companyParty2, CompanyPartyInfo.class);
			return companyPartyInfo;
		}
		return null;
	}

	@Override
	public void update(UUID companyPartyId, CompanyPartyInfo companyPartyInfo) {
		Optional<CompanyParty> company = companyPartyRepository.getByActiveAndCompanyPartyId(true, companyPartyId);
		if (company.isPresent()) {
			CompanyParty company2 = company.get();
			modelMapper.map(companyPartyInfo, company2);
			companyPartyRepository.save(company2);
		}

	}

	@Override
	public List<String> getCompanyPartyName(String companyPartyName) {
		List<CompanyParty> companyParties = companyPartyRepository
				.findTop500ByCompanyPartyNameStartingWithAndActive(companyPartyName, true);
		return companyParties.stream().map(e -> e.getCompanyPartyName()).toList();
	}

}
