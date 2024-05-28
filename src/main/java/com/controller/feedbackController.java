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

import com.dao.feedbackRepo;
import com.entity.feedback;

@RestController
@RequestMapping("feedback")
@CrossOrigin(origins = "http://localhost:3000")
public class feedbackController {
	
	@Autowired
	feedbackRepo feedback;
	
	@PostMapping("/userContact")
	public ResponseEntity<Map<String, String>> contactReq(@RequestBody feedback feed) {  
		Map<String, String> response = new HashMap<>();
		response.put("message","feedback added Successfully");
		feedback.save(feed);
		 return ResponseEntity.ok(response);
	}
	@GetMapping("/getAll")
	public List<feedback> fetchAll(){
		return feedback.findAll();
	}

}
