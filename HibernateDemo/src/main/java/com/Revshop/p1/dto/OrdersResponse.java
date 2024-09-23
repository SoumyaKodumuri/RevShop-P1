package com.Revshop.p1.dto;

import java.time.LocalDateTime;

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
public class OrdersResponse {
	private long orderId;
	private User user;
	private Double totalPrice;
	private String address;
	private String payment;
	private LocalDateTime date;


}
