package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
