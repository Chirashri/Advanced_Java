<!DOCTYPE html>
<html>
<head>
    <title>Update Coffee Product</title>
</head>
<body>
    <h2>🔧 Update Coffee Product</h2>
    <form method="get" action="UpdateCoffee.jsp">
        <label><b>ID (to update):</b></label><br>
        <input type="number" name="id" required><br><br>

        <label><b>New Coffee Name:</b></label><br>
        <input type="text" name="coffee_name" required><br><br>

        <label><b>New Price:</b></label><br>
        <input type="text" name="price" required><br><br>

        <input type="submit" value="Update Product">
    </form>
</body>
</html>
