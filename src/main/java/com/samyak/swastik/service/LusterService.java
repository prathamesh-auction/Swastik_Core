package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Luster;
import com.samyak.swastik.dto.LusterInfo;
import com.samyak.swastik.repository.LusterRepository;

@Service("lusterService")
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

	@Override
	public void save(LusterInfo lusterInfo) {
		Luster luster = modelMapper.map(lusterInfo, Luster.class);
		luster.setLusterId(UUID.randomUUID());
		lusterRepository.save(luster);

	}

}
