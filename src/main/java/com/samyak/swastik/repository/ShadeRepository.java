package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Shade;

public interface ShadeRepository extends JpaRepository<Shade, Long> {

	public List<Shade> findAllByActive(Boolean active);
}
