package com.samyak.swastik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.swastik.domain.Group;
import com.samyak.swastik.dto.GroupInfo;
import com.samyak.swastik.repository.GroupRepository;

@Service("groupService")
public class GroupService implements IGroup {

	@Autowired
	private GroupRepository groupRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<GroupInfo> get() {
		List<Group> groups = groupRepository.findAllByActive(true);
		List<GroupInfo> groupInfos = new ArrayList<>();
		groups.forEach(group -> {
			GroupInfo groupInfo = modelMapper.map(group, GroupInfo.class);
			groupInfos.add(groupInfo);
		});
		return groupInfos;
	}

	@Override
	public void save(GroupInfo groupInfo) {
		Group group = modelMapper.map(groupInfo, Group.class);
		group.setGroupId(UUID.randomUUID());
		groupRepository.save(group);

	}

}
