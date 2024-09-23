 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
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
        }
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #e0f7fa;
        display: flex;
        justify-content: center;
        align-items: center;
        margin: 0;
    }

    .registration-container {
        background-color: #ffffff;
        border-radius: 12px;
        box-shadow: 0 6px 12px rgba(0, 0, 0, 0.15);
        padding: 40px;
        width: 380px;
        border: 2px solid #00796b;
    }

    h2 {
        text-align: center;
        color: #004d40;
        margin-bottom: 25px;
        font-size: 24px;
        font-weight: 600;
    }

    label {
        display: block;
        margin-bottom: 7px;
        color: #00695c;
        font-weight: 500;
        font-size: 15px;
    }

    input[type="text"],
    input[type="email"],
    input[type="password"],
    select {
        width: calc(100% - 24px);
        padding: 12px;
        margin-bottom: 18px;
        border: 1px solid #004d40;
        border-radius: 6px;
        font-size: 15px;
        background-color: #e0f2f1;
        color: #004d40;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background-color: #004d40;
        color: white;
        border: none;
        border-radius: 6px;
        font-size: 17px;
        cursor: pointer;
        transition: background-color 0.3s ease, transform 0.3s ease;
    }

    input[type="submit"]:hover {
        background-color: #00251a;
        transform: translateY(-3px);
    }

    .note {
        font-size: 13px;
        color: #004d40;
        text-align: center;
        margin-top: 12px;
    }

    .error {
        color: #c62828;
        text-align: center;
        font-size: 14px;
        margin-top: -12px;
        margin-bottom: 12px;
    }
</style>


</head>
<body>
    <div class="registration-container">
        <h2>Registration</h2>
        <form action="register" method="post">
            <input type="hidden" name="action" value="register">
            
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            
            <label for="FirstName">First Name:</label>
            <input type="text" id="FirstName" name="first_name" required>
            
            <label for="LastName">Last Name:</label>
            <input type="text" id="LastName" name="last_name" required>
            
            
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
           
            
            <label for="phoneNo">Phone Number:</label>
            <input type="text" id="phoneNo" name="phoneNo" required>
            
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required>
            
            <label for="role">Role:</label>
            <select id="role" name="role" required>
           <option value="" disabled selected>Select a role</option>
           <option value="SELLER">SELLER</option>
           <option value="BUYER">BUYER</option>
           </select>
   
            
            <input type="submit" value="Register">
        </form>
        
        <p class="note">Already have an account? <a href="login" style="color: #007bff; text-decoration: none;">Login here</a>.</p>
        
        <!-- Display error messages dynamically -->
     <!--    <p class="error"><%= request.getAttribute("error") %></p> -->
    </div>
</body>
</html>