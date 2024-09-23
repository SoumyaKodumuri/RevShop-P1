//package com.Revshop.p1.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.Revshop.p1.dto.UserRequest;
//import com.Revshop.p1.dto.UserResponse;
//import com.Revshop.p1.service.UserService;
//
//@Controller
//public class updateProfileController {
//	
//	@Autowired
//	private UserService userservice;
//	
//	    @PostMapping("/updateProfile")
//	    public String updateUserProfile(
//	            @RequestParam String email,
//	            @RequestParam("first_name") String firstName,
//	            @RequestParam("last_name") String lastName,
//	            @RequestParam String password,
//	            @RequestParam String phoneNo,
//	            @RequestParam String address,
//	            @RequestParam long id, Model model) {
//	        
//	        try {
//	            UserRequest userrequest = new UserRequest();
//	            userrequest.setEmail(email);
//	            userrequest.setFirstname(firstName);
//	            userrequest.setLastname(lastName);
//	            userrequest.setPassword(password);
//	            userrequest.setPhoneNo(phoneNo);
//	            userrequest.setAddress(address);
//
//	            // Call service to update the user
//	            UserResponse userresponse = userservice.updateUser(userrequest, id);
//
//	            // Add the updated user to the model to display confirmation
//	            model.addAttribute("user", userresponse);
//
//	            // Redirect to the profile page or a success page
//	            return "profileUpdated";  // This should be the name of a success JSP page
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            model.addAttribute("error", "Failed to update profile");
//	            return "UpdateProfile";  // Return back to the update form in case of an error
//	        }
//	    }
//	}
//
//
//
