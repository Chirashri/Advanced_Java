<%--Read all the existing records from the table coffee which is from the database test and delete
an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively --%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Coffee</title>
</head>
<body>
<%
    String id = request.getParameter("coffee_id");

    if (id != null) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            String deleteQuery = "DELETE FROM coffee WHERE id = ?";
            ps = conn.prepareStatement(deleteQuery);
            ps.setInt(1, Integer.parseInt(id));
            ps.executeUpdate();

            out.println("<p style='color:green;'>Coffee record with ID " + id + " deleted successfully.</p>");
        } catch(Exception e) {
            out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
        } finally {
            try { if(ps != null) ps.close(); } catch(Exception e) {}
            try { if(conn != null) conn.close(); } catch(Exception e) {}
        }
    } else {
        out.println("<p style='color:red;'>No coffee record selected for deletion.</p>");
    }
%>

<jsp:forward page="disp.jsp"/>
</body>
</html>
