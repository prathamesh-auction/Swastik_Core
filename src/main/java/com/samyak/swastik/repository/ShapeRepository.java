package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Shape;

public interface ShapeRepository extends JpaRepository<Shape, Long> {

	public List<Shape> findAllByActive(Boolean active);
}
