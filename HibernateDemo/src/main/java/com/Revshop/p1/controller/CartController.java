package com.Revshop.p1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Revshop.p1.dto.CartRequest;
import com.Revshop.p1.dto.CartResponse;
import com.Revshop.p1.service.CartService;

@RestController
@RequestMapping("/cart/")
public class CartController {
	
	@Autowired
	private CartService cartservice;
	
	@PostMapping
	public boolean addToCart(CartRequest cartrequest) {
		return false;
	}
	
	@GetMapping
	public CartResponse getCartById(long CartId) {
		return null;
	}
	
	@DeleteMapping
	public boolean removeFromCart(CartRequest cartrequest) {
		return false;
	}
	
	
	@PutMapping
	public CartResponse updateCart(CartRequest cartrequest) {
		return null;
	}

}
