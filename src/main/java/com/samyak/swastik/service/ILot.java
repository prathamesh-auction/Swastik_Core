package com.samyak.swastik.service;

import java.util.List;

import com.samyak.swastik.dto.LotInfo;

public interface ILot {

	public List<LotInfo> get();

	public List<String> getLotNumber(String lotNo);
}
