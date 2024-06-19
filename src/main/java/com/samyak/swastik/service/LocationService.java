package com.samyak.swastik.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Location;
import com.samyak.swastik.dto.LocationInfo;
import com.samyak.swastik.repository.LocationRepository;

@Service("")
public class LocationService implements ILocation {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public List<LocationInfo> get() {
		List<Location> locations = locationRepository.findAllByActive(true);
		return locations.stream().map(e -> modelMapper.map(e, LocationInfo.class)).toList();
	}

	@Override
	public Optional<Location> getLocationId(String locationName) {
		Optional<Location> locationName2 = locationRepository.getByActiveAndLocationName(true, locationName);
		return locationName2;
	}

}
