package com.samyak.swastik.service;

import java.util.List;

import com.samyak.swastik.dto.OpenInclusionInfo;

public interface IOpenInclusion {

	public List<OpenInclusionInfo> get();

	public void save(OpenInclusionInfo openInclusionInfo);
}
