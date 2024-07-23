package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@GetMapping("/emp/{name}")
	public ResponseEntity<String> showEmployees(@PathVariable String name){
		return new ResponseEntity<String>("Employee",HttpStatus.OK);
	}
	
	
}
