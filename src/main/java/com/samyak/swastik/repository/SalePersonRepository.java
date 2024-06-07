package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.SalePerson;
import java.util.List;

public interface SalePersonRepository extends JpaRepository<SalePerson, Long> {

	public List<SalePerson> findAllByActive(Boolean active);
}
