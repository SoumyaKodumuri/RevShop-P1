
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<!-- CSS Styling -->
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #e0f7fa;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .login-container {
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

    input[type="email"],
    input[type="password"] {
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
    <div class="login-container">
        <h2>Login</h2>
        <form action="login" method="post">
            <input type="hidden" name="action" value="login">
            
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            
            <input type="submit" value="Login">
        </form>

        <p class="note">Don't have an account? <a href="register" style="color: #007bff; text-decoration: none;">Register here</a>.</p>

        <!-- Display error messages dynamically -->
        <p class="error"><%= request.getAttribute("error") %></p>   
    </div>
</body>
</html>