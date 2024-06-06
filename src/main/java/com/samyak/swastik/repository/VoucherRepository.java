package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Voucher;

public interface VoucherRepository extends JpaRepository<Voucher, Long> {

}
