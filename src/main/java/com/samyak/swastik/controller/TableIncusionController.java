package com.samyak.swastik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import com.samyak.swastik.dto.TableIncusionInfo;
import com.samyak.swastik.exceptions.AlreadyExistException;
import com.samyak.swastik.service.ITableIncusion;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class TableIncusionController {

	@Autowired
	private ITableIncusion tableIncusionService;

	@PostMapping(value = "/tableIncusion", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> save(@RequestBody TableIncusionInfo tableIncusionInfo) {
		try {
			tableIncusionService.save(tableIncusionInfo);
			return ResponseEntity.status(HttpStatus.CREATED).body("TableIncusion Created");
		} catch (AlreadyExistException ex) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + ex.getMessage());
		}
	}
}
