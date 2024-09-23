package com.Revshop.p1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Revshop.p1.dto.OrderItemsRequest;
import com.Revshop.p1.dto.OrderItemsResponse;
import com.Revshop.p1.model.OrderItems;

@Component
public class OrderItemsDAOImpl implements OrderItemsDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean createOrderItems(OrderItemsRequest orderItemsrequest) {
		Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
        	OrderItems orderitems= session.get(OrderItems.class, orderItemsrequest);
        	if(orderitems != null) {
        		
        	}
        	
        }
        catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public OrderItemsResponse getOrderItemsById(long itemId) {
		return null;
	}

	@Override
	public OrderItemsResponse updateOrderItemsById(OrderItemsRequest orderItemsrequest) {
		return null;
	}

	@Override
	public boolean deleteOrderItemsById(long itemId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OrderItemsResponse> getOrderItemsByOrderId(long orderId) {
		return null;
	}

	@Override
	public List<OrderItemsResponse> getOrderItemsByProductId(long productId) {
		return null;
	}

}
