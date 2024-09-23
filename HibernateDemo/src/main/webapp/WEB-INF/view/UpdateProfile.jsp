<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Profile</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #eaf2f8; /* Light background color */
        color: #2e4053; /* Dark gray-blue for text */
        margin: 0;
        padding: 0;
    }
    .update-container {
        max-width: 600px;
        margin: 0 auto;
        padding: 40px;
        background-color: #ffffff; /* White background for the form */
        border-radius: 12px;
        box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
        margin-top: 50px;
        border-left: 6px solid #5dade2; /* Accent light blue border */
        border-right: 6px solid #5dade2;
    }
    h1 {
        text-align: center;
        color: #1b4f72; /* Dark blue for the header */
        font-size: 28px;
        margin-bottom: 25px;
    }
    .form-group {
        margin-bottom: 20px;
    }
    label {
        display: block;
        font-size: 16px;
        color: #34495e; /* Gray-blue for labels */
        margin-bottom: 8px;
        font-weight: 600;
    }
    input[type="text"],
    input[type="email"] {
        width: 100%;
        padding: 12px;
        font-size: 16px;
        border: 1px solid #bdc3c7; /* Light gray borders */
        border-radius: 6px;
        background-color: #f7f9f9; /* Very light gray background for inputs */
        color: #2c3e50; /* Dark blue-gray for input text */
        transition: border-color 0.3s ease, box-shadow 0.3s ease;
    }
    input[type="text"]:focus,
    input[type="email"]:focus {
        border-color: #5dade2; /* Blue accent on focus */
        box-shadow: 0 0 8px rgba(93, 173, 226, 0.2);
        outline: none;
    }
    .actions {
        text-align: center;
        margin-top: 20px;
    }
    .btn {
        padding: 12px 24px;
        font-size: 16px;
        color: white;
        background-color: #5dade2; /* Blue button */
        border: none;
        border-radius: 6px;
        text-decoration: none;
        transition: background-color 0.2s ease-in-out, transform 0.2s ease-in-out;
        cursor: pointer;
        box-shadow: 0 6px 12px rgba(93, 173, 226, 0.2);
    }
    .btn:hover {
        background-color: #3498db; /* Darker blue on hover */
        transform: translateY(-2px);
    }
    .btn:active {
        background-color: #1f618d; /* Even darker blue on click */
        transform: translateY(0);
    }
</style>
</head>
<body>
<div class="update-container">
    <h1>Update Profile</h1>

    <form action="updateProfile" method="post">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="phone">Phone:</label>
            <input type="text" id="phone" name="phone" required>
        </div>
        <div class="form-group">
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required>
        </div>
        <div class="actions">
            <button type="submit" class="btn">Save Changes</button>
        </div>
    </form>
</div>
</body>
</html>
