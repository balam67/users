package com.users.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.registration.entity.UserRegistrationEntity;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistrationEntity, Integer> {

	UserRegistrationEntity findByUserName(String userName);
}
