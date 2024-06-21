package com.samyak.swastik.service;

import java.util.List;

import com.samyak.swastik.dto.UnitInfo;

public interface IUnit {

	public List<UnitInfo> get();

	public void save(UnitInfo unitInfo);
}
