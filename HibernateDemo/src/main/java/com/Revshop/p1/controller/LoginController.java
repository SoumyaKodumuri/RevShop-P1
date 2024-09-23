package com.Revshop.p1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Revshop.p1.dto.UserResponse;
import com.Revshop.p1.model.Role;
import com.Revshop.p1.service.UserService;

import jakarta.servlet.http.HttpSession;
@Controller
public class LoginController {
	@Autowired
	private UserService userservice;
	
	@PostMapping("login")
	public String login(@RequestParam String email, @RequestParam String password, HttpSession session, Model model) {
		UserResponse userresponse=userservice.login(email, password);
		
		session.setAttribute("Email", userresponse.getEmail());
        session.setAttribute("Name", userresponse.getFirstname() + " " + userresponse.getLastname());
        session.setAttribute("password", userresponse.getPassword());
        session.setAttribute("PhoneNo", userresponse.getPhoneNo());
        session.setAttribute("Address", userresponse.getAddress());
        session.setAttribute("role", userresponse.getRole());
		
		if(userresponse != null ) {
			
			 Role role = userresponse.getRole();
			 if (Role.BUYER.equals(role)) { 
		            
		            return "redirect:BuyerDashBoard";
		            
		        } else if (Role.SELLER.equals(role)) {
		           
		            return "redirect:SellerDashBoard";
		        }
		    } 
		
			model.addAttribute("error", "Invalid email or password");
			return "login";
		
		
	}

}
