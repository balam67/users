package com.users.registration.service;


import com.users.registration.form.UserRegistrationForm;

public interface UserRegistrationService {

	public  String registerUser(UserRegistrationForm userRegistrationForm); 
	
	public String findByUserName(String username);
		
	
}
