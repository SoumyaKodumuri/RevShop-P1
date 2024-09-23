package com.Revshop.p1.dto;

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
public class ProductRequest {
	private String productName;
	private String description;
	private double price;
	private long user_id;

}
