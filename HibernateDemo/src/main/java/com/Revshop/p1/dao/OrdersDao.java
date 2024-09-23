package com.Revshop.p1.dao;


import com.Revshop.p1.dto.OrdersRequest;
import com.Revshop.p1.dto.OrdersResponse;

public interface OrdersDao {
	
	public boolean createOrder(OrdersRequest ordersrequest);
    public OrdersResponse getOrderById(long orderId);
    public OrdersResponse updateOrder(OrdersRequest ordersrequest);
    public boolean deleteOrder(OrdersRequest ordersrequest);
}
