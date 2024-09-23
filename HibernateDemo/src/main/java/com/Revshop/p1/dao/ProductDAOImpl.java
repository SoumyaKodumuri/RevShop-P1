package com.Revshop.p1.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Revshop.p1.dto.ProductRequest;
import com.Revshop.p1.dto.ProductResponse;
import com.Revshop.p1.model.Product;
import com.Revshop.p1.model.User;


@Component
public class ProductDAOImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean createProduct(ProductRequest productrequest) {
		
		Session session=sessionFactory.openSession();
		Transaction tnx=   session.beginTransaction();
		try {
			User user=session.get(User.class, productrequest.getUser_id());
			if(user!=null) {
				Product product = Product.builder()
						.productName(productrequest.getProductName())
						.description(productrequest.getDescription())
						.price(productrequest.getPrice())
						.user(user)
						.build();
				
				session.save(product);
				tnx.commit();
				return true;
			}
			else {
				throw new Exception("user doesnt exist");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		
		return false;
	}

	@Override
	public ProductResponse getProductById(long productId) {
		Session session=sessionFactory.openSession();
		Transaction tnx=   session.beginTransaction();
		try {
			Product product= session.get(Product.class, productId);
			
			ProductResponse productresponse =ProductResponse.builder()
					               .productName(product.getProductName())
					               .description(product.getDescription())
					               .price(product.getPrice())
					               .user_id(product.getUser().getId())
					               .productId(productId)
					               .build();
			
			tnx.commit();
			return productresponse;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return null;
	}

	@Override
	public ProductResponse getProductByName(String productName) {
		Session session=sessionFactory.openSession();
		Transaction tnx=   session.beginTransaction();
		try {
			Product product= session.get(Product.class, productName);
			
			ProductResponse productresponse =ProductResponse.builder()
		                           .user_id(product.getUser().getId())
					               .description(product.getDescription())
					               .price(product.getPrice())
					               .productName(product.getProductName())
					               .build();
			
			tnx.commit();
			return productresponse;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return null;
	}

	@Override
	public boolean updateProductById(ProductRequest productrequest, long productId) {
		Session session=sessionFactory.openSession();
		Transaction tnx=   session.beginTransaction();
		try {
			
			User user=session.find(User.class, productId);

			Product product=Product.builder()
					.productName(productrequest.getProductName())
					.description(productrequest.getDescription())
					.price(productrequest.getPrice())
					.user(user)
					.productId(productId)
					.build();
		}
		catch (Exception e) {
			session.close();
		}
		
		return false;
	}

	

	@Override
	public boolean deleteProduct(long productId) {
		Session session=sessionFactory.openSession();
		Transaction tnx=   session.beginTransaction();
		try {
			Product product= session.get(Product.class, productId);
			session.remove(product);
			tnx.commit();
			return true;

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return false;
	}

	
	@Override
	public List<ProductResponse> getAllProducts() {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		 List<ProductResponse> productResponses = new ArrayList<>();

		    try {
		        List<Product> products = session.createQuery("from Product", Product.class).list();
		        
		        for (Product product : products) {
		            ProductResponse response = ProductResponse.builder()
		            	.productId(product.getProductId())
		                .productName(product.getProductName())
		                .description(product.getDescription())
		                .price(product.getPrice())
                        .user_id(product.getUser().getId())
		                .build();
		                
		            productResponses.add(response);
		        }

		        tx.commit(); // Commit transaction
		    } catch (Exception e) {
		        e.printStackTrace();
		        if (tx != null) {
		            tx.rollback(); // Rollback transaction on error
		        }
		    } finally {
		        session.close(); // Close session
		    }

		    return productResponses;
	}
}
