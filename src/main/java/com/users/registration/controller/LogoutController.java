package com.users.registration.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {

	/*
	 * @RequestMapping(value = "/logout", method = RequestMethod.GET) public String
	 * logout(HttpServletRequest request, HttpServletResponse response) {
	 * 
	 * Authentication authentication = SecurityContextHolder.getContext()
	 * .getAuthentication();
	 * 
	 * if (authentication != null) { new
	 * SecurityContextLogoutHandler().logout(request, response, authentication); }
	 * 
	 * return "redirect:/"; }
	 */
}
