package com.example.spring.stop.smoking.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.spring.stop.smoking.Repository.UserRegisterRepository;
import com.example.spring.stop.smoking.model.UserRegister;

@Service
public class UserRegisterService {
	
	@Autowired
	 UserRegisterRepository userRegisterRepository;
	
	/* save user*/
	
	public UserRegister save(UserRegister userr) {
		return userRegisterRepository.save(userr);
		
	}
	
	
	/*find all  Registered User */
	
	public List<UserRegister> findAll(){
		
		return userRegisterRepository.findAll();
		
	}
	
	
 	/*find  Registered user by id*/
	
	
	
	public Optional<UserRegister> findById(Integer rid) {
		
		 return userRegisterRepository.findById(rid);	
		
	}	
	
	/*Update User */
	 public List<UserRegister> update(@PathVariable (value="id")Integer rid){
		 	
		 UserRegister user = new UserRegister();
	 
		 user.setPhone("90002345");
		 user.setEmail("email@email.com");
	 
      		 userRegisterRepository.save(user);
			return  userRegisterRepository.findAll();
				
		 }   
	
	 /*Update Password */ 
	

}
