package com.Revshop.p1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Revshop.p1.dao.OrdersDAOImpl;
import com.Revshop.p1.dto.OrdersRequest;
import com.Revshop.p1.dto.OrdersResponse;

@Service
public class OrdersService {
	
	@Autowired
	private OrdersDAOImpl OrdersDao;
	
	public boolean createOrder(OrdersRequest ordersrequest) {
		return OrdersDao.createOrder(ordersrequest);
	}
	
	public OrdersResponse getOrderById(long orderId) {
		return OrdersDao.getOrderById(orderId);
		
	}
	
	public OrdersResponse updateOrder(OrdersRequest ordersrequest) {
		return OrdersDao.updateOrder(ordersrequest);
	}

	public boolean deleteOrder(OrdersRequest ordersrequest) {
		return OrdersDao.deleteOrder(ordersrequest);
	}


}
