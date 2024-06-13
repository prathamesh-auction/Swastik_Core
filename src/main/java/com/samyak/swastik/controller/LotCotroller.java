package com.samyak.swastik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samyak.swastik.dto.LotInfo;
import com.samyak.swastik.service.LotService;

@RestController
@RequestMapping("/api/v1")
public class LotCotroller {

	@Autowired
	private LotService lotService;

	@GetMapping(value = "/lots", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> get() {
		List<LotInfo> lots = lotService.get();
		return ResponseEntity.ok(lots);
	}

	@GetMapping(value = "/lot/{lotNo}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> getLotNumber(@PathVariable String lotNo) {
		List<String> lotNumber = lotService.getLotNumber(lotNo);
		return ResponseEntity.ok(lotNumber);
	}
}
