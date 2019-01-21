package com.example.spring.stop.smoking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.stop.smoking.model.UserRegister;

public interface UserRegisterRepository extends JpaRepository<UserRegister, Integer> {
	
	

}
