package com.samyak.swastik.service;

import java.util.List;
import java.util.Optional;

import com.samyak.swastik.domain.Location;
import com.samyak.swastik.dto.LocationInfo;

public interface ILocation {

	public List<LocationInfo> get();

	public Optional<Location> getLocationId(String locationName);
}
