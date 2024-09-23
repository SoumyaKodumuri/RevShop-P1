package com.Revshop.p1.dao;

import org.springframework.stereotype.Component;

import com.Revshop.p1.dto.CartRequest;
import com.Revshop.p1.dto.CartResponse;
@Component
public class CartDAOImpl implements CartDao {

	@Override
	public boolean addToCart(CartRequest cartrequest) {
		return false;
	}

	@Override
	public CartResponse getCartById(long CartId) {
		return null;
	}

	@Override
	public boolean removeFromCart(CartRequest cartrequest) {
		return false;
	}

	@Override
	public CartResponse updateCart(CartRequest cartrequest) {
		return null;
	}

}
