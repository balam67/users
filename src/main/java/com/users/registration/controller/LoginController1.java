package com.users.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.users.registration.service.UserRegistrationService;

@Controller
public class LoginController1 {
	/*
	 * @Autowired private UserRegistrationService userRegistrationService;
	 * 
	 * 
	 * @GetMapping("/login") public String loginGet() {
	 * 
	 * return "login";
	 * 
	 * }
	 * 
	 * @PostMapping("/login") public String loginPost(Model
	 * model, @RequestParam("username") String username, @RequestParam("password")
	 * String password) {
	 * 
	 * System.out.println("entererd in controller"); String result; String
	 * findByUserNamePassword = userRegistrationService.findByUserName(username);
	 * 
	 * if(password.equals(findByUserNamePassword)) {
	 * 
	 * model.addAttribute("loginuser", username); result= "student-enquiry-form";
	 * 
	 * }else { result= "redirect:/login"; }
	 * 
	 * return result;
	 * 
	 * }
	 * 
	 */
}
