<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Add New Coffee</h2>
    <form action="coffee.jsp" method="post">
        ID: <input type="number" name="id" required><br>
        Name: <input type="text" name="coffee_name" required><br>
        Price: <input type="number" step="0.01" name="price" required><br>
        <input type="submit" value="Add Coffee">
    </form>
</body>
</html>
