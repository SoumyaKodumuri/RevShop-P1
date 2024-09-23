package com.Revshop.p1.dto;

import com.Revshop.p1.model.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class UserResponse {
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String PhoneNo;
	private String Address;
	private Role role;


}
