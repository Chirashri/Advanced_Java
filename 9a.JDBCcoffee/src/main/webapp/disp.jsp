<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee List</title>
</head>
<body>
    <h2>Coffee Products</h2>
    <form action="delcoffee.jsp" method="post">
        <table border="1">
            <tr>
                <th>Select</th>
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

                    String query = "SELECT * FROM coffee";
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery(query);

                    while(rs.next()) {
            %>
            <tr>
                <td><input type="radio" name="coffee_id" value="<%= rs.getInt("id") %>"></td>
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
        <br>
        <input type="submit" value="Delete Selected Coffee">
    </form>
</body>
</html>
