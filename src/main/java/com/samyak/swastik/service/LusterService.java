package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Luster;
import com.samyak.swastik.dto.LusterInfo;
import com.samyak.swastik.repository.LusterRepository;

@Service
public class LusterService implements ILuster {

	@Autowired
	private LusterRepository lusterRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<LusterInfo> get() {
		List<Luster> lusters = lusterRepository.findAllByActive(true);
		List<LusterInfo> lusterInfos = new ArrayList<>();
		lusters.forEach(luster -> {
			LusterInfo lusterInfo = modelMapper.map(luster, LusterInfo.class);
			lusterInfos.add(lusterInfo);
		});
		return lusterInfos;
	}

}
