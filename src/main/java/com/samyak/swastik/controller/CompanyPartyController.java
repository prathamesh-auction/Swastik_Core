package com.samyak.swastik.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samyak.swastik.dto.CompanyPartyInfo;
import com.samyak.swastik.service.ICompanyParty;

@RestController
@RequestMapping("/api/v1")
public class CompanyPartyController {

	@Autowired
	private ICompanyParty companyPartyService;

	@GetMapping(value = "/company-parties", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> get() {
		List<CompanyPartyInfo> companyPartyInfos = companyPartyService.get();
		return ResponseEntity.ok(companyPartyInfos);
	}

	@GetMapping(value = "/company-party/{companyPartyId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> get(@PathVariable UUID companyPartyId) {
		CompanyPartyInfo companyPartyInfo = companyPartyService.get(companyPartyId);
		return ResponseEntity.ok(companyPartyInfo);
	}

	@PostMapping(value = "/company-party", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> save(@RequestBody CompanyPartyInfo companyPartyInfo) {
		companyPartyService.save(companyPartyInfo);
		return ResponseEntity.status(HttpStatus.CREATED).body("Company Party Master Created");
	}

	@GetMapping(value = "/company/{companyPartyName}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> getCompanyPartyName(@PathVariable String companyPartyName) {
		List<String> companyParty = companyPartyService.getCompanyPartyName(companyPartyName);
		return ResponseEntity.ok(companyParty);
	}
}
