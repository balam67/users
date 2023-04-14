package com.users.registration.convertion;

import com.users.registration.entity.UserRegistrationEntity;
import com.users.registration.form.UserRegistrationForm;


public class ConvertUserRegistrationFormToUserRegistrationEntity {

	public static UserRegistrationEntity  convertUserRegistrationFormToUserRegistrationEntity(UserRegistrationForm userRegistrationForm) {
		
		UserRegistrationEntity userRegistrationEntity = new UserRegistrationEntity();
		
		userRegistrationEntity.setUserName(userRegistrationForm.getUserName());
		userRegistrationEntity.setEmail(userRegistrationForm.getEmail());
		userRegistrationEntity.setPassword(userRegistrationForm.getPassword());
		userRegistrationEntity.setFirstName(userRegistrationForm.getFirstName());
		userRegistrationEntity.setLastName(userRegistrationForm.getLastName());
		userRegistrationEntity.setPhoneNumber(userRegistrationForm.getPhoneNumber());
		return userRegistrationEntity;
	}
    
	
	public static UserRegistrationForm convertUserRegistrationEntityToUserRegistrationForm(UserRegistrationEntity userRegistrationEntity) {
		
		UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
		
		userRegistrationForm.setUserName(userRegistrationEntity.getUserName());
		userRegistrationForm.setEmail(userRegistrationEntity.getEmail());
		userRegistrationForm.setPassword(userRegistrationEntity.getPassword());
		userRegistrationForm.setFirstName(userRegistrationEntity.getFirstName());
		userRegistrationForm.setLastName(userRegistrationEntity.getLastName());
		userRegistrationForm.setPhoneNumber(userRegistrationEntity.getPhoneNumber());
		
		return userRegistrationForm;
	}
}
