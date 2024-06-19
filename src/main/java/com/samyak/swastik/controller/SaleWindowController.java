package com.samyak.swastik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samyak.swastik.dto.SaleWindowInfo;
import com.samyak.swastik.dto.SaleWindowSaveInfo;
import com.samyak.swastik.service.SaleWindowService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/v1")

public class SaleWindowController {

	@Autowired
	private SaleWindowService saleWindowService;

	@GetMapping(value = "/sale-window", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> get() {
		SaleWindowInfo saleWindowInfo = saleWindowService.get();
		return ResponseEntity.ok(saleWindowInfo);
	}

	@PostMapping(value = "/sale-window", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> save(@RequestBody SaleWindowSaveInfo saleWindowSaveInfo) {
		try {
			saleWindowService.save(saleWindowSaveInfo);
			return ResponseEntity.ok("Data saved successfully");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(("An error occurred while saving data: " + e.getMessage()));
		}
	}

}
