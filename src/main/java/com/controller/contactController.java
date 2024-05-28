package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.contactUsRepo;
import com.entity.contactUs;

@RestController
@RequestMapping("contact")
@CrossOrigin(origins = "http://localhost:3000")

public class contactController {
	
	@Autowired
	contactUsRepo contactRepo;
	
	
	@PostMapping("/userContact")
	public ResponseEntity<Map<String, String>> contactReq(@RequestBody contactUs contact) {  
		Map<String, String> response = new HashMap<>();
		response.put("message","Contact added Successfully");
		contactRepo.save(contact);
		 return ResponseEntity.ok(response);
	}
	@GetMapping("/getAll")
	public List<contactUs> fetchAll(){
		return contactRepo.findAll();
	}

}
