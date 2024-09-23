<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seller Dashboard</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #e0f7fa;
        margin: 0;
        padding: 0;
    }

    /* Navigation Bar */
    .navbar {
        background-color: #004d40;
        overflow: hidden;
        padding: 20px;
    }

    .navbar a {
        float: left;
        color: white;
        text-align: center;
        padding: 12px 20px;
        text-decoration: none;
        font-size: 18px;
        transition: background-color 0.3s ease;
    }

    .navbar a:hover {
        background-color: #00251a;
    }

    /* Main dashboard container */
    .dashboard-container {
        background-color: #ffffff;
        border-radius: 12px;
        box-shadow: 0 6px 12px rgba(0, 0, 0, 0.15);
        padding: 40px;
        margin: 40px auto;
        width: 800px;
        border: 2px solid #00796b;
        text-align: center;
    }

    h2 {
        color: #004d40;
        margin-bottom: 30px;
        font-size: 24px;
        font-weight: 600;
    }

    .dashboard-form {
        margin-bottom: 15px;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        margin-bottom: 15px;
        border: none;
        border-radius: 6px;
        background-color: #004d40;
        color: white;
        font-size: 17px;
        cursor: pointer;
        transition: background-color 0.3s ease, transform 0.3s ease;
    }

    input[type="submit"]:hover {
        background-color: #00251a;
        transform: translateY(-3px);
    }

    .logout-button {
        background-color: #c62828;
    }

    .logout-button:hover {
        background-color: #8e0000;
    }

    /* Product Table */
    .product-table {
        width: 100%;
        border-collapse: collapse;
        margin: 20px 0;
    }

    .product-table th, .product-table td {
        border: 1px solid #ddd;
        padding: 8px;
    }

    .product-table th {
        background-color: #00796b;
        color: white;
        text-align: center;
    }

    .product-table td {
        text-align: center;
    }

    .action-buttons {
        display: flex;
        justify-content: center;
    }

    .action-buttons button {
        background-color: #004d40;
        color: white;
        border: none;
        padding: 10px;
        margin: 0 5px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    .action-buttons button:hover {
        background-color: #00251a;
    }

    /* Add Product Form */
    .add-product-form {
        margin-top: 30px;
        padding: 20px;
        border: 2px solid #00796b;
        border-radius: 12px;
        background-color: #f7f7f7;
    }

    .add-product-form label {
        display: block;
        text-align: left;
        font-weight: 600;
        color: #004d40;
        margin-bottom: 10px;
    }

    .add-product-form input[type="text"],
    .add-product-form input[type="number"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 20px;
        border-radius: 6px;
        border: 1px solid #00796b;
        background-color: #ffffff;
    }

</style>

<script>
    function confirmLogout() {
        var confirmLogout = confirm("Are you sure you want to logout?");
        if (confirmLogout) {
            document.getElementById("logoutForm").submit();
        }
    }

    function logoutAndRedirect() {
        fetch('/user/logout', {
            method: 'POST',
            credentials: 'same-origin'
        }).then(response => {
            if (response.ok) {
                window.location.href = '/login';
            }
        }).catch(error => console.error('Error:', error));
    }
</script>
</head>
<body>

    <!-- Navigation Bar -->
    <div class="navbar">
        <a href="#">Seller DashBoard</a>
        <a href="Profile">Profile</a>
        <a href="/deleteProfile">Delete Profile</a>
    </div>

    <!-- Main Dashboard Content -->
    <div class="dashboard-container">
        <h2>Welcome, ${firstname}</h2>

        <!-- Add Product Form -->
        <div class="add-product-form">
            <h3>Add New Product</h3>
            <form action="/addProduct" method="post">
                <label for="productName">Product Name:</label>
                <input type="text" id="productName" name="productName" required>

                <label for="description">Description:</label>
                <input type="text" id="description" name="description" required>

                <label for="price">Price:</label>
                <input type="number" id="price" name="price" step="0.01" required>

                <label for="quantity">Quantity:</label>
                <input type="number" id="quantity" name="quantity" required>

                <input type="submit" value="Add Product">
            </form>
        </div>

        <!-- Display All Products -->
        <h3>Your Products</h3>
        <table class="product-table">
            <thead>
                <tr>
                    <th>Product Name</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <!-- Loop through the products -->
                <c:forEach var="product" items="${productList}">
                    <tr>
                        <td>${product.name}</td>
                        <td>${product.description}</td>
                        <td>${product.price}</td>
                        <td>${product.quantity}</td>
                        <td class="action-buttons">
                            <button onclick="window.location.href='/updateProduct?id=${product.id}'">Update</button>
                            <button onclick="window.location.href='/deleteProduct?id=${product.id}'">Delete</button>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <!-- Logout Button -->
        <form action="/user/logout" method="post" onsubmit="return confirm('Are you sure you want to logout?');">
            <input type="submit" value="Logout" class="dashboard-button logout-button" onclick="logoutAndRedirect();">
        </form>

    </div>

</body>
</html>
