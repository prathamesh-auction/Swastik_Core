package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Unit;
import com.samyak.swastik.dto.UnitInfo;
import com.samyak.swastik.repository.UnitRepository;

@Service("unitService")
public class UnitService implements IUnit {

	@Autowired
	private UnitRepository unitRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<UnitInfo> get() {
		List<Unit> units = unitRepository.findAllByActive(true);
		List<UnitInfo> unitInfos = new ArrayList<>();
		units.forEach(unit -> {
			UnitInfo unitInfo = modelMapper.map(unit, UnitInfo.class);
			unitInfos.add(unitInfo);
		});
		return unitInfos;
	}

	@Override
	public void save(UnitInfo unitInfo) {
		Unit unit = modelMapper.map(unitInfo, Unit.class);
		unit.setUnitId(UUID.randomUUID());
		unitRepository.save(unit);
	}

}
