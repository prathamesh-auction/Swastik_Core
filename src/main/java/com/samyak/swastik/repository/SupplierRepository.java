package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
