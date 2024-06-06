package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
