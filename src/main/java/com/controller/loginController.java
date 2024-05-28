package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.signUp;
import com.service.loginService;

@RestController
@RequestMapping("login")
@CrossOrigin(origins = "http://localhost:3000")

public class loginController {


	@Autowired
    loginService loginService;
	//LoginValidation
	  @PostMapping("/userlogin")
	    public int login(@RequestBody signUp user) {
	        String username = user.getUsername();
	        String password = user.getPassword();
	        
		return loginService.loginValidation(username, password);
			
	    }
	  @PostMapping("/AdminUserlogin")
	    public int adminlogin(@RequestBody signUp users) {
		    String mobileNumber = users.getMobileNumber();
	        String username = users.getUsername();
	        String password = users.getPassword();
	        
		return loginService.loginValidation(mobileNumber, username, password);
			
	    }
}
