<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Salary Report</title>
</head>
<body>

<h2>Delete Employees By Name Starting Letter and Generate Salary Reports</h2>

<form method="post">
    Enter starting letter of name to delete: 
    <input type="text" name="startLetter" maxlength="1" required />
    <input type="submit" value="Delete & Show Report" />
</form>

<%
    String letter = request.getParameter("startLetter");
    if (letter != null && !letter.trim().isEmpty()) {
        Connection con = null;
        PreparedStatement deleteStmt = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", ""); // Change as needed

            out.println("<h3>Salary Report (Before Deletion)</h3>");
            out.println("<pre>");
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Emp");

            while (rs.next()) {
                out.println("Emp_No   : " + rs.getInt("Emp_No"));
                out.println("Emp_Name : " + rs.getString("Emp_Name"));
                out.println("Basicsalary    : " + rs.getFloat("Basicsalary"));
                out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

            rs.close();
            stmt.close();

            // Delete employees starting with given letter
            String deleteQuery = "DELETE FROM Emp WHERE Emp_Name LIKE ?";
            deleteStmt = con.prepareStatement(deleteQuery);
            deleteStmt.setString(1, letter + "%");
            int deletedCount = deleteStmt.executeUpdate();
            out.println("</pre>");
            out.println("<h3>" + deletedCount + " employee(s) deleted whose name started with '" + letter + "'</h3>");

            // Show report after deletion
            out.println("<h3>Salary Report (After Deletion)</h3>");
            out.println("<pre>");
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Emp");

            while (rs.next()) {
                out.println("Emp_No   : " + rs.getInt("Emp_No"));
                out.println("Emp_Name : " + rs.getString("Emp_Name"));
                out.println("Basicsalary    : " + rs.getFloat("Basicsalary"));
                out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            out.println("</pre>");

        } catch (Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (deleteStmt != null) deleteStmt.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    }
%>

</body>
</html>
