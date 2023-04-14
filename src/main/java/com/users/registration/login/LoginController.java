package com.users.registration.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	
	     
	     @PostMapping("/login")  
	     public String welcomePage(ModelAndView model, @RequestParam String username, @RequestParam String password) {  
	    	 
	    	 if(username.equals("admin") && password.equals("admin"))  {
	    		
	    		 return "home";
	    	 }
	    	 model.addObject("errorMsg", "Please Enter valid Credientials");
	        return "login";  
	     }  

}
