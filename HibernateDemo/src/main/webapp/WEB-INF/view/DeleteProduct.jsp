<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Product</title>
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
            text-align: center;
            border: 2px solid #00796b;
        }

        h2 {
            color: #004d40;
            margin-bottom: 25px;
        }

        label {
            display: block;
            margin-bottom: 7px;
            color: #00695c;
            font-weight: 500;
        }

        input[type="number"],
        input[type="submit"] {
            width: calc(100% - 22px);
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
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
            transition: background-color 0.3s ease,transform 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #00251a;
            transform: translateY(-3px);
        }
    </style>
    
    <script>
        function confirmDeletion(event) {
            var confirmAction = confirm("Are you sure you want to delete this product?");
            if (!confirmAction) {
                event.preventDefault(); // Prevent form submission if user cancels
            }
        }
    </script>
</head>
<body>
    <div class="form-container">
        <h2>Delete Product</h2>
        <form action="product/" method="get" onsubmit="confirmDeletion(event)">
            <label for="productId">Product ID:</label>
            <input type="number" id="productId" name="productId" required>
            <input type="submit" value="Delete Product">
        </form>
    </div>
</body>
</html>
