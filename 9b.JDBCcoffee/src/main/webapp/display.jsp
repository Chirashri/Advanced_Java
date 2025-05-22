<!-- WebContent/display.jsp -->
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee Records</title>
</head>
<body>
    <h2>Coffee Names Starting with 'D'</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
        <%
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

                String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
                stmt = conn.createStatement();
                rs = stmt.executeQuery(query);

                while(rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("coffee_name") %></td>
            <td><%= rs.getDouble("price") %></td>
        </tr>
        <%
                }
            } catch(Exception e) {
                out.println("Error: " + e.getMessage());
            } finally {
                try { if(rs != null) rs.close(); } catch(Exception e) {}
                try { if(stmt != null) stmt.close(); } catch(Exception e) {}
                try { if(conn != null) conn.close(); } catch(Exception e) {}
            }
        %>
    </table>
</body>
</html>
