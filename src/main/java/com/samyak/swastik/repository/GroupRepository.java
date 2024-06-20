package com.samyak.swastik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samyak.swastik.domain.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

	public List<Group> findAllByActive(Boolean active);
}
