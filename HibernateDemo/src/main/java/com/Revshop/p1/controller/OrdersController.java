package com.Revshop.p1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Revshop.p1.dto.OrdersRequest;
import com.Revshop.p1.dto.OrdersResponse;
import com.Revshop.p1.service.OrdersService;

@RestController
@RequestMapping("/orders/")
public class OrdersController {
	
	@Autowired
	private OrdersService ordersservice;
	
	@PostMapping
	public boolean createOrder(OrdersRequest ordersrequest) {
		try {
			return ordersservice.createOrder(ordersrequest);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;

		}
		
	}
	@GetMapping
	public OrdersResponse getOrderById(long orderId) {
		try {
			return ordersservice.getOrderById(orderId);
		}
		catch(Exception e) {
		return null;
		}
		
	}
	@PutMapping
	public OrdersResponse updateOrder(OrdersRequest ordersrequest) {
		try {
			return ordersservice.updateOrder(ordersrequest);
		}
		catch(Exception e) {
		return null;}
	}

	@DeleteMapping
	public boolean deleteOrder(OrdersRequest ordersrequest) {
		try {
			return ordersservice.deleteOrder(ordersrequest);
		}
		catch(Exception e) {
		return false;
	}
	}


}
