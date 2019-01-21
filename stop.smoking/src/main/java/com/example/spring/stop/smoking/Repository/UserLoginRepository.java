package com.example.spring.stop.smoking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.stop.smoking.model.UserLogin;;

public interface UserLoginRepository extends JpaRepository<UserLogin, Integer> {
	
	
}
