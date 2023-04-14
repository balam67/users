package com.users.registration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	
	Logger logger = LoggerFactory.getLogger(UserRegistrationController.class);
	@Autowired
	private UserRegistrationService userRegistrationService;

	@GetMapping("/")
	public String homePage(Model model) {
		
		logger.info("I applied logging in my application");
		UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
		model.addAttribute("userRegistrationForm", userRegistrationForm);
		
		logger.error("i created null pointer exception in my application");
		return "index";
	}
	
	@RequestMapping(value = "/registeruser",method = RequestMethod.POST)
	 public String registerUser(@ModelAttribute("userRegistrationForm") UserRegistrationForm userRegistrationForm, Model model) {
		logger.info("I applied logging in my user method");
		
		String registeruser = userRegistrationService.registerUser(userRegistrationForm);
		model.addAttribute("registerUser", registeruser);
		logger.error("i created Arithemetic  exception in my application");
	  int i=1/1;
		if(registeruser.equals(null)) {
			
			registeruser= "user-registration-failed";
			
		}else if(registeruser != null) {
	  
			
			registeruser= "user-registration-sucess";
	 }
	
	return "login";
 }
}