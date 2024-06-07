package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.InvoiceType;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<InvoiceType, Long> {

	public List<InvoiceType> findAllByActive(Boolean active);
}
