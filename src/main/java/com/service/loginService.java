package com.service;

import org.springframework.stereotype.Repository;

@Repository
public interface loginService {
	public int loginValidation(String username,String password);
	public int loginValidation(String mobileNumber ,String  username,String password);

}
