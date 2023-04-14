package com.users.studentenquiry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.users.registration.form.UserRegistrationForm;
import com.users.studentenquiry.form.StudentEnquiryForm;
import com.users.studentenquiry.service.StudentEnquiryService;

//@RestController
@Controller
public class StudentEntityController {
	@Autowired
	private StudentEnquiryService studentEnquiryService;

	@GetMapping("/savestudent")
	public String saveStudent(Model model) {
		//updateStudentEnquiry(8,model);
		
		StudentEnquiryForm studentEnquiryForm = new StudentEnquiryForm();
		
		model.addAttribute("studentEnquiryForm", studentEnquiryForm);
		return "student-enquiry-form";
	}
	
	@RequestMapping(value = "/studentenquiry",method = RequestMethod.POST)
	 public String registerUser(@ModelAttribute("studentEnquiryForm") StudentEnquiryForm studentEnquiryForm, Model model) {
		
		String studentEnquiry= null;
		String studentName= null;
		
		StudentEnquiryForm saveStudentEnquiryForm = studentEnquiryService.saveStudentEnquiry(studentEnquiryForm);
		model.addAttribute("saveStudentEnquiryForm", saveStudentEnquiryForm);
		
		model.addAttribute("saveStudentEnquiryForm", saveStudentEnquiryForm);
		
		studentName = saveStudentEnquiryForm.getStudentName();
	  
		if(studentName.equals(null)) {
			
			studentEnquiry= "student-enquiry-failed";
			
		}else if(studentName != null) {
	  
			
			studentEnquiry= "student-enquiry-sucess";
	 }
		return "student-enquiry-form";
	
	}
	
	
	
	
	@RequestMapping(value = "/studentenquiry",method = RequestMethod.PUT)
	 public String registerUserUpdated(@ModelAttribute("studentEnquiryForm") StudentEnquiryForm studentEnquiryForm, Model model) {
		
		String studentEnquiry= null;
		String studentName= null;
		
		//StudentEnquiryForm saveStudentEnquiryForm = studentEnquiryService.saveStudentEnquiry(studentEnquiryForm);
		//model.addAttribute("saveStudentEnquiryForm", saveStudentEnquiryForm);
		
		//model.addAttribute("saveStudentEnquiryForm", saveStudentEnquiryForm);
		
		
	 studentName = studentEnquiryService.updateEnquiry(studentEnquiryForm);
		
		
		
		//studentName = updateEnquiry.getStudentName();
	  
		if(studentName.equals(null)) {
			
			studentEnquiry= "student-enquiry-failed";
			
		}else if(studentName != null) {
	  
			
			studentEnquiry= "student-enquiry-sucess";
	 }
		return studentEnquiry;
	
	}
	
	
	
	
	
     @RequestMapping(value = "/studentenquiryupdate/{studentId}",method= RequestMethod.GET)
	 public String updateStudentEnquiry(@PathVariable("studentId") Integer studentId, Model model ) {
		
    	
	//Integer i= 7;
		System.out.println("UPDATE METHOD");
	StudentEnquiryForm studentEnquiryForm = studentEnquiryService.updateStudentEnquiry(studentId);
	studentEnquiryForm.setStudentId(studentId);
	
	String updateEnquiry = studentEnquiryService.updateEnquiry(studentEnquiryForm);
		
	model.addAttribute("studentEnquiryForm", studentEnquiryForm);
	
	
	
	return "enquiryformupdated";
	
	
	
	}
	
	
	
	
	@GetMapping("/enqurieslist")
	public String enquriesList(Model model) {
		
	
		List<StudentEnquiryForm> studentEnquriesList = studentEnquiryService.getStudentEnquries();
		model.addAttribute("studentEnquriesList", studentEnquriesList);
		
		return "student-enqury-list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

