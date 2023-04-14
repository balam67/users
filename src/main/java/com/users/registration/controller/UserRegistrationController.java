package com.users.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.users.registration.form.UserRegistrationForm;
import com.users.registration.service.UserRegistrationService;

@Controller
public class UserRegistrationController {
	
	@Autowired
	private UserRegistrationService userRegistrationService;

	@GetMapping("/")
	public String homePage(Model model) {
		UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
		model.addAttribute("userRegistrationForm", userRegistrationForm);
		
		
		return "index";
	}
	
	@RequestMapping(value = "/registeruser",method = RequestMethod.POST)
	 public String registerUser(@ModelAttribute("userRegistrationForm") UserRegistrationForm userRegistrationForm, Model model) {
		
		String registeruser = userRegistrationService.registerUser(userRegistrationForm);
		model.addAttribute("registerUser", registeruser);
	  
		if(registeruser.equals(null)) {
			
			registeruser= "user-registration-failed";
			
		}else if(registeruser != null) {
	  
			
			registeruser= "user-registration-sucess";
	 }
	
	return "login";
 }
}