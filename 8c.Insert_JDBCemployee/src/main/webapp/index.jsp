<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>Enter Employee Details</h2>
    <form action="insert.jsp" method="post">
        Emp No: <input type="text" name="empno"><br><br>
        Name: <input type="text" name="empname"><br><br>
        Basic Salary: <input type="text" name="salary"><br><br>
        <input type="submit" value="Add Employee">
    </form>
    <br><a href="report.jsp">Generate Salary Report</a>
</body>
</html>