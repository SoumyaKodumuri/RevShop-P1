package com.Revshop.p1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Revshop.p1.dao.CartDAOImpl;
import com.Revshop.p1.dto.CartRequest;
import com.Revshop.p1.dto.CartResponse;

@Service
public class CartService {
	
	@Autowired
	private CartDAOImpl cartDao;
	
	public boolean addToCart(CartRequest cartrequest) {
		return cartDao.addToCart(cartrequest) ;
	}
	
	public CartResponse getCartById(long CartId) {
		return cartDao.getCartById(CartId);
	}

	
	public boolean removeFromCart(CartRequest cartrequest) {
		return cartDao.removeFromCart(cartrequest);
	}
	
	
	public CartResponse updateCart(CartRequest cartrequest) {
		return cartDao.updateCart(cartrequest);
	}
}
