package com.users.studentenquiry.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_enquiry")
public class StudentEnquiryEntity {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	
      @Column(name="studentid")
	  private Integer studentId;
	  
	  @Column(name="studentname")
	  private  String studentName;
	  
	  @Column(name="phone_number")
	  private String phoneNumber;
	  
	  @Column(name="class_mode")
	  private String classMode;
	  
	  @Column(name="course")
	  private String course;
	  
	  @Column(name="enquiry_status")
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

	
	public StudentEnquiryEntity() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentEnquiryEntity [studentId=" + studentId + ", studentName=" + studentName + ", phoneNumber="
				+ phoneNumber + ", classMode=" + classMode + ", course=" + course + ", enquiryStatus=" + enquiryStatus
				+ "]";
	}

	public StudentEnquiryEntity(Integer studentId, String studentName, String phoneNumber, String classMode,
			String course, String enquiryStatus) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.phoneNumber = phoneNumber;
		this.classMode = classMode;
		this.course = course;
		this.enquiryStatus = enquiryStatus;
	}
	  
	  
		/*
		 * @Column(name="online") private String online;
		 * 
		 * @Column(name="classroom") private String classRoom;
		 * 
		 * @Column(name="javafullstack") private String javaFullDtack;
		 * 
		 * @Column(name="devops") private String devops;
		 * 
		 * @Column(name="aws") private String aws;
		 * 
		 * @Column(name="newEnroll") private String newEnroll;
		 * 
		 * @Column(name="enrolled") private String enrolled;
		 * 
		 * @Column(name="lost") private String lost;
		 */
	  
	 
}