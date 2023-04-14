package com.users.studentenquiry.convertformtoentity;

import java.util.ArrayList;
import java.util.List;

import com.users.studentenquiry.entity.StudentEnquiryEntity;
import com.users.studentenquiry.form.StudentEnquiryForm;

public class ConvertStudentFormToStudentEntity {

	
	public static StudentEnquiryForm convertEntityToForm(StudentEnquiryEntity studentEnquiryEntity) {
		
		
		StudentEnquiryForm StudentEnquiryForm = new StudentEnquiryForm();
		
		StudentEnquiryForm.setStudentId(studentEnquiryEntity.getStudentId());
		StudentEnquiryForm.setStudentName(studentEnquiryEntity.getStudentName());
		StudentEnquiryForm.setPhoneNumber(studentEnquiryEntity.getPhoneNumber());
		
		StudentEnquiryForm.setCourse(studentEnquiryEntity.getCourse());
		StudentEnquiryForm.setClassMode(studentEnquiryEntity.getClassMode());
		StudentEnquiryForm.setEnquiryStatus(studentEnquiryEntity.getEnquiryStatus());
		
		
		return StudentEnquiryForm;
	}
	
public static List<StudentEnquiryForm> convertEntityToFormList(List<StudentEnquiryEntity> studentEnquiryEntityList) {
		
	List<StudentEnquiryForm> studentEnquiryFormList = new ArrayList<>();
	
	for (StudentEnquiryEntity studentEnquiryEntity : studentEnquiryEntityList) {
	    
        StudentEnquiryForm StudentEnquiryForm = new StudentEnquiryForm();
		
		StudentEnquiryForm.setStudentId(studentEnquiryEntity.getStudentId());
		StudentEnquiryForm.setStudentName(studentEnquiryEntity.getStudentName());
		StudentEnquiryForm.setPhoneNumber(studentEnquiryEntity.getPhoneNumber());
		
		StudentEnquiryForm.setClassMode(studentEnquiryEntity.getClassMode());
		StudentEnquiryForm.setCourse(studentEnquiryEntity.getCourse());
		StudentEnquiryForm.setEnquiryStatus(studentEnquiryEntity.getEnquiryStatus());
		
		
		
		studentEnquiryFormList.add(StudentEnquiryForm);
		
	
	}
	
		return studentEnquiryFormList;
	}
	
	public static StudentEnquiryEntity convertFormToEntity(StudentEnquiryForm studentEnquiryForm) {
		
		StudentEnquiryEntity studentEnquiryEntity = new StudentEnquiryEntity();

		studentEnquiryEntity.setStudentName(studentEnquiryForm.getStudentName());
		studentEnquiryEntity.setStudentId(studentEnquiryForm.getStudentId());
		studentEnquiryEntity.setPhoneNumber(studentEnquiryForm.getPhoneNumber());
		studentEnquiryEntity.setClassMode(studentEnquiryForm.getClassMode());
		studentEnquiryEntity.setCourse(studentEnquiryForm.getCourse());
		studentEnquiryEntity.setEnquiryStatus(studentEnquiryForm.getEnquiryStatus());
	
		return studentEnquiryEntity;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
