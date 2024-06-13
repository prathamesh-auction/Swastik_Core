package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.samyak.swastik.domain.Lot;

public interface LotRepository extends JpaRepository<Lot, Long> {

	@Query()
	public List<Lot> findAllByActive(Boolean active);

	public List<Lot> findTop500ByLotNoStartingWithAndActive(String lotName, Boolean active);
}
