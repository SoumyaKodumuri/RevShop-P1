<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
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

    .form-container {
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
    input[type="number"] {
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
</style>

</head>
<body>
    <div class="form-container">
        <h2>Add Product</h2>
        <form action="/product/add" method="post">
        
            <label for="productName">Product Name:</label>
            <input type="text" id="productName" name="productName" required>

            <label for="productDescription">Description:</label>
            <input type="text" id="productDescription" name="productDescription" required>

            <label for="price">Price:</label>
            <input type="text" id="price" name="price" required>

            <input type="submit" value="Add Product">
        </form>
    </div>
</body>
</html>
