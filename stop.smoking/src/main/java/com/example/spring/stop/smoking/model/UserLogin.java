package com.example.spring.stop.smoking.model;

 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

 
 

@Entity
public class UserLogin  {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	
	@NotBlank
	private String username;
	@NotBlank
	private String password;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserLogin() {
		super();
	 
	}
	
	
 
}
