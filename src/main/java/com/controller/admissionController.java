package com.controller;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dao.admissionRepo;

import com.entity.admission;

@RestController
@RequestMapping("/admission")
@CrossOrigin(origins = "http://localhost:3000")
public class admissionController {
	@Autowired
	admissionRepo adrRepo;
	
	@PostMapping("/addStudent")
	public ResponseEntity<Map<String, String>> addUser(@RequestBody admission adm) {  
		Map<String, String> response = new HashMap<>();
		response.put("message","Admission is Successfully Done");
		adrRepo.save(adm);
		 return ResponseEntity.ok(response);
	}
	@GetMapping("/getAll")
	public List<admission> fetchAll(){
		return adrRepo.findAll();
	}
}
