
 package com.example.spring.stop.smoking.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
 
@EnableGlobalMethodSecurity(prePostEnabled= true) 
@EnableWebSecurity 
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


	  @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	                .authorizeRequests()
	                    .antMatchers(
	                            "/ ").permitAll()
	                    .anyRequest().authenticated()
	                .and()
	                    .formLogin()
	                        .loginPage("/login")
	                            .permitAll()
	                .and()
	                    .logout()
	                        .invalidateHttpSession(true)
	                        .clearAuthentication(true)
	                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	                        .logoutSuccessUrl("/login?logout")
	                .permitAll();
	    }
	  
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

  

}
