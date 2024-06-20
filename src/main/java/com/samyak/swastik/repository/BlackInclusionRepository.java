package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.BlackInclusion;

public interface BlackInclusionRepository extends JpaRepository<BlackInclusion, Long> {

	public List<BlackInclusion> findAllByActive(Boolean active);
}
