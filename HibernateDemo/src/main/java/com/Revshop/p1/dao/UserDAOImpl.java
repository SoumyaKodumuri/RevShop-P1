
package com.Revshop.p1.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Revshop.p1.dto.UserRequest;
import com.Revshop.p1.dto.UserResponse;
import com.Revshop.p1.model.User;

@Component
public class UserDAOImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean createUser(UserRequest userrequest) {
		Session session=sessionFactory.openSession();
		Transaction tnx=   session.beginTransaction();
		try {
			User user =User.builder()
					       .firstname(userrequest.getFirstname())
					       .lastname(userrequest.getLastname())
					       .email(userrequest.getEmail())
					       .password(userrequest.getPassword())
					       .PhoneNo(userrequest.getPhoneNo())
					       .Address(userrequest.getAddress())
					       .role(userrequest.getRole())
					       .build();
			
			session.save(user);
			tnx.commit();
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return false;
	}

	@Override
	public UserResponse getUserById(long id) {
		Session session=sessionFactory.openSession();
		Transaction tnx=   session.beginTransaction();
		try {
			User user =session.get(User.class, id);
					return UserResponse.builder()
					       .firstname(user.getFirstname())
					       .lastname(user.getLastname())
					       .email(user.getEmail())
					       .password(user.getPassword())
					       .PhoneNo(user.getPhoneNo())
					       .Address(user.getAddress())
					       .role(user.getRole())
					       .id(user.getId())
					       .build();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
		
	}

	@Override
	public UserResponse updateUser(UserRequest userrequest, long id) {
		Session session =sessionFactory.openSession();
		 Transaction tnx=  session.beginTransaction();
		 try {
			 User user=User.builder()
					 .firstname(userrequest.getFirstname())
					 .lastname(userrequest.getLastname())
					 .email(userrequest.getEmail())
					 .password(userrequest.getPassword())
					 .PhoneNo(userrequest.getPhoneNo())
					 .Address(userrequest.getAddress())
					 .role(userrequest.getRole())
					 .id(id)
					 .build();
			 
			 session.saveOrUpdate(user);
			 tnx.commit();
			 user=session.get(User.class, id);
			 
			 return UserResponse.builder()
				       .firstname(user.getFirstname())
				       .lastname(user.getLastname())
				       .email(user.getEmail())
				       .password(user.getPassword())
				       .PhoneNo(user.getPhoneNo())
				       .Address(user.getAddress())
				       .role(user.getRole())
				       .id(user.getId())
				       .build();
					 
					   
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 session.close();
		return null;
	}

	@Override
	public boolean deleteUser(long id) {
		Session session=sessionFactory.openSession();
		Transaction tnx=   session.beginTransaction();
		
		try {
			User user=session.get(User.class, id);
			
			session.remove(user);
			
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
	public UserResponse login(String email, String password) {
		
		Session session=sessionFactory.openSession();
		Transaction tnx=   session.beginTransaction();
		
	/*	//hql-hibernate query language
		String hql="FROM User u WHERE u.email= :email AND u.password= :password";
		try {
			User user = (User) session.createQuery(hql)
					.setParameter("email", email)
					.setParameter("password", password)
					.getSingleResult();
					
	*/
		
		
	/*	//jpql-java persistance query language
				String jpql="SELECT u FROM User u WHERE u.email= :email AND u.password= :password";
				try {
					User user=session.createQuery(jpql, User.class)
							.setParameter("email", email)
							.setParameter("password", password)
							.getSingleResult();
		*/		
					
			String	nq=	"SELECT u FROM User u WHERE u.email=?1 AND u.password=?2";
			try {
				  
				 User user=session.createQuery(nq, User.class)
						 .setParameter(1, email)
						 .setParameter(2, password)
						 .getSingleResult();
					
			
			tnx.commit();      
			
			return UserResponse.builder()
					.firstname(user.getFirstname())
				       .lastname(user.getLastname())
				       .email(user.getEmail())
				       .password(user.getPassword())
				       .PhoneNo(user.getPhoneNo())
				       .Address(user.getAddress())
				       .role(user.getRole())
				       .id(user.getId())
				       .build();			
		}
		
	
		catch (Exception e) {
			e.printStackTrace();
		}
		session.close();
		return null;
	}

	@Override
	public UserResponse logout(UserRequest userrequest) {
		Session session=sessionFactory.openSession();
		Transaction tnx=   session.beginTransaction();
		return null;
	}

}
