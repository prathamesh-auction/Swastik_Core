package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Voucher;
import java.util.List;


public interface VoucherRepository extends JpaRepository<Voucher, Long> {

	
}
