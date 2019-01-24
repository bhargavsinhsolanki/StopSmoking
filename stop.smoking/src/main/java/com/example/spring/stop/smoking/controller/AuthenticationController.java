/*package com.example.spring.stop.smoking.controller;

import javax.naming.AuthenticationException;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.stop.smoking.model.UserLogin;
import com.example.spring.stop.smoking.security.JwtTokenUtil;
import com.example.spring.stop.smoking.service.UserLoginService;

@RestController
@RequestMapping("/token")
public class AuthenticationController    {
	
	    @Autowired
	    private AuthenticationManager authenticationManager;

	    @Autowired
	    private JwtTokenUtil jwtTokenUtil;

	    @Autowired
	    private UserLoginService userService;

	    @RequestMapping(value = "/generate-token", method = RequestMethod.POST)
	    public ResponseEntity register(@RequestBody UserLogin loginUser) throws AuthenticationException {

	        final Authentication authentication = authenticationManager.authenticate(
	                new UsernamePasswordAuthenticationToken(
	                        loginUser.getUsername(),
	                        loginUser.getPassword()
	                )
	        );
	        SecurityContextHolder.getContext().setAuthentication(authentication);
	        final UserLogin user = userService.findOne(loginUser.getUsername());
	        final String token = jwtTokenUtil.generateToken(user);
	        return ResponseEntity.ok(new AuthToken(token));
	    }

}
*/