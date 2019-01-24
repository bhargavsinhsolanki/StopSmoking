package com.example.spring.stop.smoking.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.spring.stop.smoking.Repository.UserRegisterRepository;
import com.example.spring.stop.smoking.model.UserRegister;

@Service
public class UserRegisterService {
	
	@Autowired
	 UserRegisterRepository userRegisterRepository;
	

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	/* save user*/
	public UserRegister save(UserRegister userr) {
		 userr.setPassword(passwordEncoder.encode(userr.getPassword()));
		return userRegisterRepository.save(userr);
		
	}
	
	
	/*find all  Registered User */
	
	public List<UserRegister> findAll(){
		
		return userRegisterRepository.findAll();
		
	}
	

	/*Get User by User id*/
	 
	public ResponseEntity<Optional<UserRegister>> findById(@PathVariable(value="id") Integer rid){
		
		Optional<UserRegister> user =userRegisterRepository.findById(rid);
		
		
		if(user==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(user);
		
	}
	
	
	/*Update User */
	
	public ResponseEntity<UserRegister> updateUser(@PathVariable(value="id")Integer rid,@Valid @RequestBody UserRegister userDetails){
			
		Optional<UserRegister>  opuser = userRegisterRepository.findById(rid);
		UserRegister user = opuser.get();
			if(user==null) {
				return ResponseEntity.notFound().build();
			}
			
			user.setEmail(userDetails.getEmail());
			user.setPhone(userDetails.getPhone());
			 
			UserRegister updateUser = userRegisterRepository.save(user);
			return ResponseEntity.ok().body(updateUser);
						
		}
	 
	
	/*Update Password */ 
	

}
