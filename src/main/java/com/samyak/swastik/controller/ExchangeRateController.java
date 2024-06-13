package com.samyak.swastik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samyak.swastik.dto.ExchangeRateInfo;
import com.samyak.swastik.service.ExchangeRateService;

@RestController
@RequestMapping("/api/v1")
public class ExchangeRateController {

	@Autowired
	private ExchangeRateService exchangeRateService;

	@GetMapping(value = "/exchange-rate/{exchangeDate}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> get(@PathVariable String exchangeDate) {
		ExchangeRateInfo exchangeRateInfo = exchangeRateService.get(exchangeDate);
		return ResponseEntity.ok(exchangeRateInfo);
	}
}
