package com.Revshop.p1.dao;

import com.Revshop.p1.dto.CartRequest;
import com.Revshop.p1.dto.CartResponse;

public interface CartDao {
	public boolean addToCart(CartRequest cartrequest);
	public CartResponse getCartById(long CartId);
	public boolean removeFromCart(CartRequest cartrequest);
	
	public CartResponse updateCart(CartRequest cartrequest);

}
