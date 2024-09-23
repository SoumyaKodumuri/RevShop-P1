package com.Revshop.p1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Revshop.p1.dao.UserDAOImpl;
import com.Revshop.p1.dto.UserRequest;
import com.Revshop.p1.dto.UserResponse;

@Service
public class UserService {
	
	private UserDAOImpl userDao;
	
	@Autowired
	public UserService(UserDAOImpl userDao) {
		this.userDao= userDao;
	}
	
	public boolean createUser(UserRequest userrequest) {
		return userDao.createUser(userrequest);
		
	}
	
	public UserResponse getUserById(long id) {
		return userDao.getUserById(id);
		
	}
	public UserResponse updateUser(UserRequest userrequest, long id) {
		return userDao.updateUser(userrequest, id);
		
	}
	public boolean deleteUser(long id) {
		return userDao.deleteUser(id);
		
	}
	
	public UserResponse login(String email, String password) {
		return userDao.login(email, password);
	}


    public UserResponse logout(UserRequest userrequest) {
		return userDao.logout(userrequest);
    	
    }

	public boolean isEmailTaken(String email) {
		return false;
	}



}
