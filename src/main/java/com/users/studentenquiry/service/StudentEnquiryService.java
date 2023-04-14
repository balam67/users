package com.users.studentenquiry.service;


import com.users.studentenquiry.form.StudentEnquiryForm;

import java.util.List;



public interface StudentEnquiryService {

	public StudentEnquiryForm saveStudentEnquiry(StudentEnquiryForm studentEnquiryForm);
	
	public List<StudentEnquiryForm> getStudentEnquries();
	
	public String updateEnquiry(StudentEnquiryForm studentEnquiryForm);
	
	public StudentEnquiryForm updateStudentEnquiry(Integer studentId);
}
