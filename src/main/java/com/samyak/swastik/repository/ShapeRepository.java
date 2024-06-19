package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Shape;

public interface ShapeRepository extends JpaRepository<Shape, Long> {

}
