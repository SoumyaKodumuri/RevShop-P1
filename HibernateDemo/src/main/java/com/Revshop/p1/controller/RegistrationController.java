package com.Revshop.p1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Revshop.p1.dto.UserRequest;
import com.Revshop.p1.service.UserService;

@Controller
public class RegistrationController {
	@Autowired
	private UserService userservice;
	
	@PostMapping("register")
	public String register(UserRequest userrequest, RedirectAttributes redirectAttributes)
	{
		if(userservice.isEmailTaken(userrequest.getEmail()))
		{
			redirectAttributes.addFlashAttribute("error Message", "Email is already registered. Please use a different email.");
			return "redirect:/register";
		}
		 boolean isUserCreated = userservice.createUser(userrequest);
		 
		 if (!isUserCreated) {
	            redirectAttributes.addFlashAttribute("errorMessage", "Registration failed. Please try again.");
	            return "redirect:register";
	        }
		 
		 return "redirect:login";
	}

}
