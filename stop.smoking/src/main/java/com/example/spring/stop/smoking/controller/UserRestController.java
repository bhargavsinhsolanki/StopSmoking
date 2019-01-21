package com.example.spring.stop.smoking.controller;

import java.util.List;
import java.util.Optional;

//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.spring.stop.smoking.model.UserLogin;
import com.example.spring.stop.smoking.model.UserRegister;
import com.example.spring.stop.smoking.service.UserLoginService;
import com.example.spring.stop.smoking.service.UserRegisterService;
import javax.validation.Valid;

@RestController
 public class UserRestController {

	 @Autowired
	 UserLoginService userLogin;
	 
//	  @Autowired
//	  private PasswordEncoder passwordEncoder;
	 
	//to get login page form
	 @RequestMapping("/login")
	 public ModelAndView login () {
	     ModelAndView modelAndView = new ModelAndView();
	     modelAndView.setViewName("login");
	     return modelAndView;
	 }
	 	 
	 /*save login user */
	 @RequestMapping(value="/login", method=RequestMethod.POST)
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
	 
	//to get register page form
	 @RequestMapping("/register")
	 public ModelAndView  register() {
	     ModelAndView modelAndView = new ModelAndView();
	     modelAndView.setViewName("register");
	     return modelAndView;
	 }
		
	 /*save  Registered user */
	 @RequestMapping(value="/register",method=RequestMethod.POST)
	 public UserRegister createUserRegister(@Valid @RequestBody UserRegister userr) {
		 
		 return userRegister.save(userr);
		 
	 }
	 
	 /*Get all  Registered user */
	 
	 @GetMapping("/all")
	 public List<UserRegister> getAllRegisteredUsers(){
		 return userRegister.findAll();
	 }
	 
	  
	 /*Get User by ID */
	 
	 @GetMapping("/user/{id}")
	 public   Optional<UserRegister> getRegisterUserById(@PathVariable (value="id")Integer rid){
		 
		return userRegister.findById(rid);
			
	 }   
  
 /*Update User by ID */
	 
	 @GetMapping("/user/update/{id}")
	 public   List<UserRegister> update(@PathVariable (value="id")Integer rid){
		 
		return userRegister.update(rid) ;
			
	 }   
	
		
}
