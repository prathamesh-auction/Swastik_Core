package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.InvoiceType;

public interface InvoiceRepository extends JpaRepository<InvoiceType, Long> {

}
