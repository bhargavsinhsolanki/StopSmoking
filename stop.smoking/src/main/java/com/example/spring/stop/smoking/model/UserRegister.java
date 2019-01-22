package com.example.spring.stop.smoking.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
//import javax.validation.constraints.NotBlank;

@Entity
public class UserRegister implements UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
	//@NotBlank
   	private String firstname;
	//@NotBlank
	private  String middlename;
	//@NotBlank
	private String lastname;
	//@NotBlank
	private String phone;
	//@NotBlank
	private String profession;
	 
	private int smokingduration;
 
	private int smokingfreq;
	
	//@NotBlank
	@Email
	private  String email;
	//@NotBlank
	private  String password;
	 
 	private Date birthdate;
	
	private GenderType gender;
	
	private DrinkingType drinking;
 	
 	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
	public String getMiddleName() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getSmokingduration() {
		return smokingduration;
	}
	public void setSmokingduration(int smokingduration) {
		this.smokingduration = smokingduration;
	}
	public int getSmokingfreq() {
		return smokingfreq;
	}
	public void setSmokingfreq(int smokingfreq) {
		this.smokingfreq = smokingfreq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
 
	public GenderType getGender() {
		return gender;
	}
	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	public DrinkingType getDrinking() {
		return drinking;
	}
	public void setDrinking(DrinkingType drinking) {
		this.drinking = drinking;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
