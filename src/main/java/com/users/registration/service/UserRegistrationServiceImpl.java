package com.users.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.registration.convertion.ConvertUserRegistrationFormToUserRegistrationEntity;
import com.users.registration.entity.UserRegistrationEntity;
import com.users.registration.form.UserRegistrationForm;
import com.users.registration.repository.UserRegistrationRepository;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRegistrationRepository repo;
	@Override
	public String registerUser(UserRegistrationForm userRegistrationForm) {
		
		UserRegistrationEntity convertUserRegistrationFormToUserRegistrationEntity = ConvertUserRegistrationFormToUserRegistrationEntity.convertUserRegistrationFormToUserRegistrationEntity(userRegistrationForm);
		
		UserRegistrationEntity saveUserRegistrationEntity = repo.save(convertUserRegistrationFormToUserRegistrationEntity);
		
		String userName = saveUserRegistrationEntity.getUserName();
		return userName;
	}
	@Override
	public String findByUserName(String username) {


		UserRegistrationEntity findByUserName = repo.findByUserName(username);
		String dbPassword = findByUserName.getPassword();
		
		return dbPassword;
	}
	
}
