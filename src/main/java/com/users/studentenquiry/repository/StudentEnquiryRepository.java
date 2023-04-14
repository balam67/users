package com.users.studentenquiry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.studentenquiry.entity.StudentEnquiryEntity;

@Repository
public interface StudentEnquiryRepository extends JpaRepository<StudentEnquiryEntity, Integer> {

}
