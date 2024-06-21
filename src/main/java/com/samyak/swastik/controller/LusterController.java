package com.samyak.swastik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samyak.swastik.dto.LusterInfo;
import com.samyak.swastik.exceptions.AlreadyExistException;
import com.samyak.swastik.service.ILuster;

@RestController
@RequestMapping("/api/v1")
public class LusterController {

	@Autowired
	private ILuster lusterService;

	@PostMapping(value = "/luster", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> save(@RequestBody LusterInfo lusterInfo) {
		try {
			lusterService.save(lusterInfo);
			return ResponseEntity.status(HttpStatus.CREATED).body("Luster Created");
		} catch (AlreadyExistException ex) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + ex.getMessage());
		}
	}

}
