package com.Revshop.p1.dao;

import java.util.List;

import com.Revshop.p1.dto.OrderItemsRequest;
import com.Revshop.p1.dto.OrderItemsResponse;
import com.Revshop.p1.dto.OrdersRequest;

public interface OrderItemsDao {
	public boolean createOrderItems(OrderItemsRequest orderItemsrequest);

	public OrderItemsResponse getOrderItemsById(long itemId);
	
	public OrderItemsResponse updateOrderItemsById(OrderItemsRequest orderItemsrequest);
	
	public boolean deleteOrderItemsById(long itemId);
	
	List<OrderItemsResponse> getOrderItemsByOrderId(long orderId);
	
	List<OrderItemsResponse> getOrderItemsByProductId(long productId);

	
}
