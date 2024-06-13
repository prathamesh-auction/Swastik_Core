package com.samyak.swastik.service;

import java.util.List;
import java.util.UUID;

import com.samyak.swastik.dto.CompanyPartyInfo;

public interface ICompanyParty {

	public List<CompanyPartyInfo> get();

	public void save(CompanyPartyInfo companyPartyInfo);

	public CompanyPartyInfo get(UUID companyPartyId);

	public void update(UUID companyPartyId, CompanyPartyInfo companyPartyInfo);

	public List<String> getCompanyPartyName(String companyPartyName);
}
