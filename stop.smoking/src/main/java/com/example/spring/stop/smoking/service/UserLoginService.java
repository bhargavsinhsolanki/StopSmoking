package com.example.spring.stop.smoking.service;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.spring.stop.smoking.Repository.UserLoginRepository;
import com.example.spring.stop.smoking.model.UserLogin;
 
 
 
@Service(value= "userlService")
public class UserLoginService implements UserDetailsService  {
	
	@Autowired
	 UserLoginRepository userLoginRepository;
	
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	/* save user*/
	
	public UserLogin save(UserLogin userl) {
		 userl.setPassword(passwordEncoder.encode(userl.getPassword()));
		return userLoginRepository.save(userl);
		
	}
	
	/*find all  Registered User */
	
	public List<UserLogin> findAll(){
		
		return userLoginRepository.findAll();
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	 
}
