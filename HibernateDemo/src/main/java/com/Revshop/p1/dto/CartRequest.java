package com.Revshop.p1.dto;

import com.Revshop.p1.model.Product;
import com.Revshop.p1.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CartRequest {
	// private long cartId;
    private User user;
	private Product product;
	private int Quantity;
	private double TotalPrice;



}
