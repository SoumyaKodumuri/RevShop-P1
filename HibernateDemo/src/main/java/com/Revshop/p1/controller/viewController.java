package com.Revshop.p1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class viewController {
	
	@GetMapping("register")
	public String registerJsp() {
		return "Registration";
	}
	
	@GetMapping("login")
	public String loginJsp() {
		return "Login";
	}
	
	
	@GetMapping("SellerDashBoard")
	public String SellerDashBoard() {
		return "SellerDashBoard";
	}
	
	@GetMapping("BuyerDashBoard")
	public String BuyerDashBoard() {
		return "BuyerDashBoard";
	}
	
	@GetMapping("add")
	public String AddProducts() {
		return "AddProducts";
	}
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("Profile")
	public String updateProfile() {
		return "Profile";
	}
	
	@GetMapping("all")
	public String AllProducts() {
		return "AllProducts";
	}
	
}
