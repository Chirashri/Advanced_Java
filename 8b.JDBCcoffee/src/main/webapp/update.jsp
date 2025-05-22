<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
</head>
<body>

<form method="post" action="">
    Emp No: <input type="number" name="empno" required><br>
    Emp Name: <input type="text" name="empname" required><br>
    Basic Salary: <input type="number" step="0.01" name="basicsalary" required><br>
    <input type="submit" value="Update Employee">
</form>

<%
    String empnoStr = request.getParameter("empno");
    String empname = request.getParameter("empname");
    String salaryStr = request.getParameter("basicsalary");

    if (empnoStr != null && empname != null && salaryStr != null &&
        !empnoStr.isEmpty() && !empname.isEmpty() && !salaryStr.isEmpty()) {
        
        int empno = Integer.parseInt(empnoStr);
        double basicsalary = Double.parseDouble(salaryStr);

        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String password = "";  // change if needed

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            String sql = "UPDATE Emp SET Emp_Name=?, Basicsalary=? WHERE Emp_No=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, empname);
            pstmt.setDouble(2, basicsalary);
            pstmt.setInt(3, empno);

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                out.println("<h3>Employee updated successfully!</h3>");
            } else {
                out.println("<h3>No employee found with Emp_No " + empno + ".</h3>");
            }
            pstmt.close();

            // Show salary report
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

            out.println("<h2>Salary Report</h2><pre>");
            while (rs.next()) {
                out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                out.println("Emp_No   : " + rs.getInt("Emp_No"));
                out.println("Emp_Name : " + rs.getString("Emp_Name"));
                out.println("Basicsalary    : " + rs.getDouble("Basicsalary"));
            }
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>");

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
%>

</body>
</html>
