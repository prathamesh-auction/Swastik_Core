package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.LotCategory;

public interface LotCategoryRepository extends JpaRepository<LotCategory, Long> {

}
