package com.samyak.swastik.service;

import java.util.List;

import com.samyak.swastik.dto.PolishInfo;

public interface IPolish {

	public List<PolishInfo> get();

	public void save(PolishInfo polishInfo);
}
