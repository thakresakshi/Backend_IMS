package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.signUp;
import com.dao.UserRepository;

@Service
public class loginServiceImpl implements loginService {

    @Autowired
    private UserRepository userRepository;

    public int loginValidation(String username, String password) {
        // Use UserRepository to find the user by email
        List<signUp> users = userRepository.findByUsername(username);
        if (users != null && users.size() != 0 && users.get(0).getPassword().equals(password)) {
            return 1; // Valid login
        } else {
            System.out.println("Invalid Username/Password");
            return 0; // Invalid login
        }
    }
    public int loginValidation(String mobileNumber, String username, String password) {
        // Use UserRepository to find the user by mobilenumber
        List<signUp> mobile = userRepository.findByMobileNumber(mobileNumber);
        if (mobile != null && mobile.size() != 0 && mobile.get(0).getUsername().equals(username)&& mobile.get(0).getPassword().equals(password)) {
            return 1; // Valid login
        } else {
            System.out.println("Invalid Username/Password");
            return 0; // Invalid login
        }
    }
    
}


