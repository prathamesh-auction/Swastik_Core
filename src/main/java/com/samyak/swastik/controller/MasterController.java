package com.samyak.swastik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samyak.swastik.dto.DiamondMasterInfo;
import com.samyak.swastik.service.IMaster;

@RestController
@RequestMapping("/api/v1")
public class MasterController {

	@Autowired
	private IMaster masterService;

	@GetMapping(value = "/diamond-masters", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> getAllDiamondMasters() {
		DiamondMasterInfo masterInfo = masterService.getAllDiamondMasters();
		return ResponseEntity.ok(masterInfo);
	}
}
