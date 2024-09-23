<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
 <div class="container"> 
 <h2>Profile</h2>
 <div class="profile-info">
          <p><label>First Name:</label><span>${User.firstname}</span></p>
           <p><label>Last Name:</label><span>${User.lastname}</span></p>
            <p><label>Email:</label><span>${User.email}</span></p>
              <p><label>Password:</label><span>${User.password}</span></p>
           <p><label>Phone Number:</label><span>${User.PhoneNo}</span></p>
            <p><label>Address:</label><span>${User.Address}</span></p>
      
 </div>
</div>

</body>
</html>