package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Lab;
import com.samyak.swastik.dto.LabInfo;
import com.samyak.swastik.repository.LabRepository;

@Service
public class LabService implements ILab {

	@Autowired
	private LabRepository labRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<LabInfo> get() {
		List<Lab> labs = labRepository.findAllByActive(true);
		List<LabInfo> labInfos = new ArrayList<>();
		labs.forEach(lab -> {
			LabInfo labInfo = modelMapper.map(lab, LabInfo.class);
			labInfos.add(labInfo);
		});
		return labInfos;
	}

}
