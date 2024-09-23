<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import= "java.util.*"%>
<%@page import="com.Revshop.p1.dto.ProductResponse" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Products</title>
</head>
<body>

<div class="container mt-4">
    <h1 class="text-center mb-4">Search and Display Products</h1>
    
    <!-- Search form -->
    <form action="all" method="get" class="form-inline justify-content-center search-form">
        <input type="text" name="query" class="form-control mr-2" placeholder="Search for products" required>
        <button type="submit" class="btn btn-primary">Search</button>
    </form>
    
    <div class="row">
        <%
            List<ProductResponse> products = (List<ProductResponse>) request.getAttribute("products");
            if (products != null && !products.isEmpty()) {
                for (ProductResponse product : products) {
        %>
        <div class="col-md-4 mb-4">
            <div class="card">
               
                
                <div class="card-body">
                
                    <h5 class="card-title"><%= product.getProductName() %></h5>
                    <p class="card-text"><%= product.getDescription() %></p>
                    <p class="card-text">Price: ${product.price}</p>
                 
                    <a href="addToCart?id=<%= product.getProductId() %>" class="btn btn-custom">Add to Cart</a>
                    <a href="BuyNow?productId=<%= product.getProductId() %>" class="btn btn-success-custom">Buy Now</a>
                </div>
            </div>
        </div>
        <%
                }
            } else {
            	
        %>
        <div class="col-12 no-products">
            <p>No products found.</p>
        </div>
        <%
            }
        %>
    </div>
</div>

</body>
</html>