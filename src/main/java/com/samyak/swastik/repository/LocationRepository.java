package com.samyak.swastik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Location;
import java.util.List;
import java.util.Optional;

public interface LocationRepository extends JpaRepository<Location, Long> {

	public List<Location> findAllByActive(Boolean active);

	public Optional<Location> getByActiveAndLocationName(Boolean active, String locationName);
}
