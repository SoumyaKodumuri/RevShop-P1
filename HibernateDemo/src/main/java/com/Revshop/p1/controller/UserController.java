package com.Revshop.p1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.Revshop.p1.dto.UserRequest;
import com.Revshop.p1.dto.UserResponse;
import com.Revshop.p1.model.Role;
import com.Revshop.p1.service.UserService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/user/")
public class UserController {
	
	@Autowired
    UserService userservice;
	
	@PostMapping("register")
	public boolean createUser(@RequestBody UserRequest userrequest) {
		try {
			return userservice.createUser(userrequest);
		}
		catch (Exception e) 
		{
		return false;
		}
	}
		
		@GetMapping
		public UserResponse getUserById(@RequestParam long id) {
			return userservice.getUserById(id);
		}
		
		@PutMapping("updateProfile")
		public UserResponse updateUser(@RequestBody UserRequest userrequest, @RequestParam long id) {
			try {
				return userservice.updateUser(userrequest, id);
			}
			catch (Exception e) {
				return null;

			}
							
		}
		
		@DeleteExchange
		public boolean deleteUser(long id) {
			return userservice.deleteUser(id);
			
		}

//        @GetMapping("login/")
//		public UserResponse login(@RequestParam  String email, @RequestParam String password) {
//			return userservice.login(email, password);
//		}
//
//		
        @PostMapping("login")
        
		public UserResponse login(@RequestParam  String email, @RequestParam String password) {
       	return userservice.login(email, password);
        }

        
         
        @PostMapping("logout")
        public UserResponse logout(UserRequest userrequest) {
        	
        	return userservice.logout(userrequest);
        }
	
	
	

}
