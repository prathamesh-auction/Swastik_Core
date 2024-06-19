package com.samyak.swastik.service;

import java.util.List;
import java.util.Optional;

import com.samyak.swastik.domain.Lot;
import com.samyak.swastik.dto.LotInfo;

public interface ILot {

	public List<LotInfo> get();

	public List<String> getLotNumber(String lotNo);

	public Optional<Lot> getLotId(String lotName);
}
