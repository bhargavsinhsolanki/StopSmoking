package com.example.spring.stop.smoking.controller;

import java.util.List;
import java.util.Optional;

//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.spring.stop.smoking.model.UserLogin;
import com.example.spring.stop.smoking.model.UserRegister;
import com.example.spring.stop.smoking.service.UserLoginService;
import com.example.spring.stop.smoking.service.UserRegisterService;
import javax.validation.Valid;

@RestController
 public class UserRestController {

	 @Autowired
	 UserLoginService userLogin;
	 

	 /*save login user */
	 @RequestMapping(value="/user/login", method=RequestMethod.POST)
	 public UserLogin createUserLogin(@Valid @RequestBody UserLogin userl) {
		 
	 
	//	 passwordEncoder.encode(userl.getPassword());

		 return userLogin.save(userl);
		 
	 }
	 
	 
	 @GetMapping("userlogin/all")
	 public List<UserLogin> userLoginRepository(){
		 return userLogin.findAll();
	 }
	 
	/*-------------------------------------------------------------------------------------*/
	 @Autowired
	 UserRegisterService userRegister;
	 	
	 /*Save  Registered user */
	 @PostMapping("/user/register")
	 public UserRegister createUserRegister(@Valid @RequestBody UserRegister userr) {
		 
		 return userRegister.save(userr);
		 
	 }
	 
	 /*Get all  Registered User */
	 
	 @GetMapping("/user/all")
	 public List<UserRegister> getAllRegisteredUsers(){
		 return userRegister.findAll();
	 }
	 
	  
	 /*Get Registered User by ID */
	 
	 @GetMapping("/user/{id}")
	 public   ResponseEntity<Optional<UserRegister>> getRegisterUserById(@PathVariable (value="id")Integer rid){
		 
		return userRegister.findById(rid);
			
	 }   
  
	 /*Update Registered User by ID */
	 
 	 @PutMapping("/user/update/{id}")
	 public ResponseEntity< UserRegister> updateUser(@PathVariable(value="id")Integer rid,@Valid @RequestBody UserRegister userDetails){
			
		 return userRegister.updateUser(rid, userDetails);
		 
		
		}
	 	
}
