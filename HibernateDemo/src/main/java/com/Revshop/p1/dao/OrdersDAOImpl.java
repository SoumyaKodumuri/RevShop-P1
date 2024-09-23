package com.Revshop.p1.dao;

import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Revshop.p1.dto.OrdersRequest;
import com.Revshop.p1.dto.OrdersResponse;
import com.Revshop.p1.model.Orders;
import com.Revshop.p1.model.User;
@Component
public class OrdersDAOImpl implements OrdersDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public boolean createOrder(OrdersRequest ordersrequest) {
		Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
        	 // Assuming userId is part of the orderRequest and the relation with the user is established.
            User user = session.get(User.class, ordersrequest.getUser());
            if (user != null) {
                Orders order = Orders.builder()
                        .user(ordersrequest.getUser())
                        .totalPrice(ordersrequest.getTotalPrice())
                        .address(ordersrequest.getAddress())
                        .payment(ordersrequest.getPayment())
                        .date(LocalDateTime.now())  // Assuming date is set at the time of order creation.
                        .build();
                session.save(order);
                tx.commit();
                return true;
             } 
             else {
                    throw new Exception("User doesn't exist");
                   }
        }
        catch (Exception e) {
            e.printStackTrace();
        } 
         session.close();
		return false;
	}

	@Override
	public OrdersResponse getOrderById(long orderId) {
		Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
			User user=session.find(User.class, orderId);

            Orders order = session.get(Orders.class, orderId);
            if (order != null) {
                return OrdersResponse.builder()
                        .orderId(order.getOrderId())
                        .user(order.getUser())
                        .totalPrice(order.getTotalPrice())
                        .address(order.getAddress())
                        .payment(order.getPayment())
                        .date(order.getDate())
                        .build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
	}
		

	@Override
	public OrdersResponse updateOrder(OrdersRequest ordersrequest) {
		Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            Orders order = session.get(Orders.class, ordersrequest.getUser());
            if (order != null) {
                order.setTotalPrice(ordersrequest.getTotalPrice());
                order.setAddress(ordersrequest.getAddress());
                order.setPayment(ordersrequest.getPayment());
                order.setDate(LocalDateTime.now());  // Updating the date to the current time.
                session.update(order);
                tx.commit();
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
		return null;
	}

	@Override
	public boolean deleteOrder(OrdersRequest ordersrequest) {
		Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            Orders order = session.get(Orders.class, ordersrequest.getUser());
            if (order != null) {
                session.delete(order);
                tx.commit();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
		return false;
	}

}
