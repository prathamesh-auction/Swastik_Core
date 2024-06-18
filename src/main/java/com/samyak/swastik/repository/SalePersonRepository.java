package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.SalePerson;
import java.util.List;
import java.util.Optional;

public interface SalePersonRepository extends JpaRepository<SalePerson, Long> {

	public List<SalePerson> findAllByActive(Boolean active);
	
	public Optional<SalePerson> getByActiveAndSalesPersonName(Boolean active, String salesPersonName);
}
