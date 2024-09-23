package com.Revshop.p1.dao;

import com.Revshop.p1.dto.UserRequest;
import com.Revshop.p1.dto.UserResponse;

public interface UserDao {
	boolean createUser(UserRequest userrequest);
	UserResponse getUserById(long id);
	UserResponse updateUser(UserRequest userrequest, long id);
	boolean deleteUser(long id);
	UserResponse login(String email, String password);
	
    public UserResponse logout(UserRequest userrequest) ;


}
