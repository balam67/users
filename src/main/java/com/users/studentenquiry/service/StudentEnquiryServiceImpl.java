package com.users.studentenquiry.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.studentenquiry.convertformtoentity.ConvertStudentFormToStudentEntity;
import com.users.studentenquiry.entity.StudentEnquiryEntity;
import com.users.studentenquiry.form.StudentEnquiryForm;
import com.users.studentenquiry.repository.StudentEnquiryRepository;

@Service
public class StudentEnquiryServiceImpl implements StudentEnquiryService {

	
	@Autowired
	private StudentEnquiryRepository studentRepo;
	@Override
	public StudentEnquiryForm saveStudentEnquiry(StudentEnquiryForm studentEnquiryForm) {
		
		StudentEnquiryEntity convertFormToEntity = ConvertStudentFormToStudentEntity.convertFormToEntity(studentEnquiryForm);
		 StudentEnquiryEntity savedStudentEnquiryEntity = studentRepo.save(convertFormToEntity);

		 StudentEnquiryForm convertEntityToForm = ConvertStudentFormToStudentEntity.convertEntityToForm(savedStudentEnquiryEntity);
		
		return convertEntityToForm;
	}
	@Override
	public List<StudentEnquiryForm> getStudentEnquries() {


		List<StudentEnquiryEntity> findAllStudentEnquriesList = studentRepo.findAll();
		
		List<StudentEnquiryForm> convertEntityToFormList = ConvertStudentFormToStudentEntity.convertEntityToFormList(findAllStudentEnquriesList);
		
		
		
		return convertEntityToFormList;
	}
	@Override
	public String updateEnquiry(StudentEnquiryForm studentEnquiryForm) {

		StudentEnquiryEntity convertFormToEntity = ConvertStudentFormToStudentEntity.convertFormToEntity(studentEnquiryForm);
		
		
		
		studentRepo.save(convertFormToEntity);
		
		
		
		return "enquiry-updated-sucessfully";
		}
	
	
	@Override
	public StudentEnquiryForm updateStudentEnquiry(Integer studentId) {
		
		Optional<StudentEnquiryEntity> findById = studentRepo.findById(studentId);
		StudentEnquiryEntity studentEnquiryEntity = findById.get();
		StudentEnquiryForm convertEntityToForm = ConvertStudentFormToStudentEntity.convertEntityToForm(studentEnquiryEntity);
		
		studentRepo.save(studentEnquiryEntity);
		return convertEntityToForm;
	}
	}


