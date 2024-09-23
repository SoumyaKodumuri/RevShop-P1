<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REVSHOP</title>
<style>
    body {
        height: 100%;
        margin: 0;
        padding: 0;
        background-image: url('https://cdn.pixabay.com/photo/2021/01/30/14/43/laptop-5964102_1280.jpg'); 
        background-size: cover;       
        background-position: center;  
        background-repeat: no-repeat; 
        background-attachment: scroll; 
        font-family: Arial, sans-serif;
    }

    /* Fixed welcome message */
    .fixed-message {
    position: fixed;
    top: 10%;
    left: 45%;
    transform: translate(-50%, -50%); /* Center horizontally and vertically */
    color: purple;
    text-align: center;
    font-size: 30px;
    font-weight: bold;
    z-index: 1000;
    background-color: transparent; /* No background color */
}



   

    /* Adjusting navbar position below scroll message */
    .navbar {
        top: 100px;
        right: 0;
        padding: 20px;
        position: fixed;
    }

    .navbar button {
        background-color: #007bff;
        border: none;
        color: white;
        padding: 10px 20px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        margin-left: 10px;
        cursor: pointer;
        border-radius: 5px;
        transition: background-color 0.3s ease;
    }

    .navbar button:hover {
        background-color: #0056b3;
    }

    .navbar .login-btn {
        background-color: #28a745;
    }

    .navbar .login-btn:hover {
        background-color: #218838;
    }

</style>
</head>
<body>

    <!-- Fixed Welcome message -->
    <div class="fixed-message">
        WELCOME TO REVSHOP<br>
         HappY Shopping :)
    </div>

  
       
    

    <!-- Navigation Bar for Login and Registration Buttons -->
    <div class="navbar">
        <button class="login-btn" onclick="window.location.href='login'">Login</button>
        <button class="register-btn" onclick="window.location.href='register'">Register</button>
    </div>

</body>
</html>
