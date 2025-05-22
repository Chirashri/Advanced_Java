<%--8d. Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively--%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Employee</title>
</head>
<body>
    <h2>Update Employee Record</h2>
    <form action="update.jsp" method="post">
        Emp No: <input type="text" name="empno" required><br><br>
        Emp Name: <input type="text" name="empname" required><br><br>
        Basic Salary: <input type="text" name="basicsalary" required><br><br>
        <input type="submit" value="Update">
    </form>
</body>
</html>
