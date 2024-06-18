package com.samyak.swastik.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.LotCategory;

public interface LotCategoryRepository extends JpaRepository<LotCategory, Long> {

	public List<LotCategory> findAllByActive(Boolean active);
	
	public Optional<LotCategory> getByActiveAndLotCategoryName(Boolean active, String lotCategoryName);
}
