<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e0f7fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .form-container {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 6px 12px rgba(0, 0, 0, 0.15);
            padding: 30px;
            width: 350px;
            text-align: 2px solid #00796b;
        }

        h2 {
            text-align: center;
            color: #004d40;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #00695c;
            font-weight: 15px;
        }

        input[type="text"],
        input[type="number"],
        input[type="submit"] {
            width: calc(100% - 24px);
            padding: 12px;
            margin-bottom: 18px;
            border: 1px solid #004d40;
            border-radius: 5px;
            font-size: 16px;
            background-color: #e0f2f1;
            color: #004d40;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #004d40;
            color: white;
            border: none;
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
        <h2>Update Product</h2>
        <!-- Assuming this JSP page is displaying the product details -->
<form id="updateProduct">
    <input type="hidden" id="productId" value="${product.productId}" />
    
    <label for="productName">Product Name:</label>
    <input type="text" id="productName" value="${product.productName}" /><br>
    
    <label for="productDescription">Description:</label>
    <input type="text" id="productDescription" value="${product.description}" /><br>
    
    <label for="price">Price:</label>
    <input type="number" id="price" value="${product.price}" /><br>
    
  
    
    <!-- Button to trigger update -->
    <button type="button" onclick="updateProduct()">Update Product</button>
    
    <!-- Button to trigger delete -->
    <button type="button" onclick="deleteProduct()">Delete Product</button>
</form>

<script>
    // Update Product Function
    function updateProduct() {
        const productId = document.getElementById('productId').value;
        const productName = document.getElementById('productName').value;
        const productDescription = document.getElementById('productDescription').value;
        const price = document.getElementById('price').value;

        fetch(`/product/${productId}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                productName: productName,
                productDescription: description,
                price: price,
            })
        })
        .then(response => response.json())
        .then(data => {
            alert('Product updated successfully!');
            // Optionally, reload or redirect the page
        })
        .catch(error => console.error('Error:', error));
    }

    // Delete Product Function
    function deleteProduct() {
        const productId = document.getElementById('productId').value;

        fetch(`/product/${productId}`, {
            method: 'DELETE'
        })
        .then(response => {
            if (response.ok) {
                alert('Product deleted successfully!');
                // Optionally, redirect or refresh the page
            }
        })
        .catch(error => console.error('Error:', error));
    }
</script>

    </div>
</body>
</html>
