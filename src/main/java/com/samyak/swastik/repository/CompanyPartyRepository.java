package com.samyak.swastik.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.CompanyParty;
import com.samyak.swastik.domain.Lot;

public interface CompanyPartyRepository extends JpaRepository<CompanyParty, Long> {

	public List<CompanyParty> findAllByActive(Boolean active);

	public Optional<CompanyParty> getByActiveAndCompanyPartyId(Boolean active, UUID companyPartyId);
	
	public List<CompanyParty> findTop500ByCompanyPartyNameStartingWithAndActive(String companyPartyName, Boolean active);
}
