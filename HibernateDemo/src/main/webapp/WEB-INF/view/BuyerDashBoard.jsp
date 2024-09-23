<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Buyer DashBoard</title>
    <!-- Bootstrap CSS CDN link -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f4f4f9;
        }
        .nav-link {
            color: #ffffff !important;
        }
        .nav-link:hover {
            color: #cccccc !important;
        }
        .container {
            margin-top: 20px;
        }
        .card {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">Buyer DashBoard</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#profile">Profile</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="products">Products</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#orders">Orders</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#cart">Cart</a>
                </li>
                <li class="nav-item">
                    <form action="/user/logout" method="post" class="form-inline" onsubmit="return confirm('Are you sure you want to logout?');">
                        <button type="submit" value="Logout" class="dashboard-button logout-button" onclick="logoutAndRedirect();">Logout</button>
                    </form>
     <script>
    function logoutAndRedirect() {
        fetch('/user/logout', {
            method: 'POST',
            credentials: 'same-origin'
        }).then(response => {
            if (response.ok) {
                // Redirect to login page
                window.location.href = '/login';
            }
        }).catch(error => console.error('Error:', error));
    }
</script>
                    
                </li>
            </ul>
        </div>
    </nav>

    <!-- Content Sections -->
    <div class="container">
        <!-- Buyer Profile Section -->
        <div id="profile" class="card">
            <div class="card-header">
                <h5>Profile</h5>
            </div>
            <div class="card-body">
                <p>Update or delete your profile information:</p>
                <a href="UpdateProfile" class="btn btn-primary">Update Profile</a>
                <a href="DeleteProfile" class="btn btn-danger">Delete Profile</a>
            </div>
        </div>

        <!-- Products Section -->
        <div id="products" class="card">
            <div class="card-header">
                <h5>Products</h5>
            </div>
            <div class="card-body">
                <p>View all available products:</p>
                <a href="AllProducts" class="btn btn-success">View Products</a>
            </div>
        </div>

        <!-- Orders Section -->
        <div id="orders" class="card">
            <div class="card-header">
                <h5>Orders</h5>
            </div>
            <div class="card-body">
                <p>Check the orders you have made:</p>
                <a href="Orders" class="btn btn-info">View Orders</a>
            </div>
        </div>

        <!-- Cart Section -->
        <div id="cart" class="card">
            <div class="card-header">
                <h5>Cart</h5>
            </div>
            <div class="card-body">
                <p>View items in your cart:</p>
                <a href="Cart" class="btn btn-warning">View Cart</a>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
