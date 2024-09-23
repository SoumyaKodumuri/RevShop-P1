package com.Revshop.p1.dto;

import com.Revshop.p1.model.Orders;
import com.Revshop.p1.model.Product;

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
public class OrderItemsRequest {
//	private long itemId;
	private Orders orders;
	private Product product;



}
