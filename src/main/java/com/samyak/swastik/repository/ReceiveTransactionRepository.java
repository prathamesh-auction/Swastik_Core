package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.ReceiveTransaction;

public interface ReceiveTransactionRepository extends JpaRepository<ReceiveTransaction, Long> {

}
