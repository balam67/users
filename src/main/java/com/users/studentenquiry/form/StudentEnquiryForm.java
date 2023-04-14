package com.users.studentenquiry.form;

import org.springframework.stereotype.Component;

@Component
public class StudentEnquiryForm {

	
	  private Integer studentId;
	  
	  private  String studentName;
	 
	  private String phoneNumber;
	  
	  private String classMode;
	  private String course;
	  private String enquiryStatus;
	  
	  
	  
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getClassMode() {
		return classMode;
	}
	public void setClassMode(String classMode) {
		this.classMode = classMode;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEnquiryStatus() {
		return enquiryStatus;
	}
	public void setEnquiryStatus(String enquiryStatus) {
		this.enquiryStatus = enquiryStatus;
	}
	@Override
	public String toString() {
		return "StudentEnquiryForm [studentId=" + studentId + ", studentName=" + studentName + ", phoneNumber="
				+ phoneNumber + ", classMode=" + classMode + ", course=" + course + ", enquiryStatus=" + enquiryStatus
				+ "]";
	}
	  
	  //private String online;
	  
	 // private String classRoom; 
	
		/*
		 * private String javaFullDtack;
		 * 
		 * private String devops;
		 * 
		 * private String aws;
		 * 
		 * private String newEnroll;
		 * 
		 * private String enrolled;
		 * 
		 * private String lost;
		 */

}
