package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Color;

public interface ColorRepository extends JpaRepository<Color, Long> {

	public List<Color> findAllByActive(Boolean active);
}
