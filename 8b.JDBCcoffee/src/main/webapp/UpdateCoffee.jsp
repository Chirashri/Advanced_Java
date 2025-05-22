<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Coffee Update Result</title>
</head>
<body>

<%
    String dbURL = "jdbc:mysql://localhost:3306/test";
    String user = "root";     // Change to your DB username
    String pass = "";         // Change to your DB password

    Connection con = null;
    PreparedStatement pst = null;
    Statement st = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(dbURL, user, pass);

        String id = request.getParameter("id");
        String name = request.getParameter("coffee_name");
        String price = request.getParameter("price");

        if (id != null && name != null && price != null &&
            !id.isEmpty() && !name.isEmpty() && !price.isEmpty()) {

            pst = con.prepareStatement("UPDATE coffee SET coffee_name=?, price=? WHERE id=?");
            pst.setString(1, name);
            pst.setDouble(2, Double.parseDouble(price));
            pst.setInt(3, Integer.parseInt(id));

            int rows = pst.executeUpdate();
            if (rows > 0) {
                out.println("<p style='color:green;'>✅ Coffee product updated successfully!</p>");
            } else {
                out.println("<p style='color:red;'>⚠️ No product found with ID = " + id + "</p>");
            }
        }

        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM coffee");
%>

<h2>☕ All Coffee Records</h2>
<table border="1" cellpadding="5" cellspacing="0">
    <tr style="background-color: #f2f2f2;">
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
    </tr>
<%
        while (rs.next()) {
%>
    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("coffee_name") %></td>
        <td><%= rs.getDouble("price") %></td>
    </tr>
<%
        }
    } catch (Exception e) {
        out.println("<p style='color:red;'>❌ Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) rs.close();
        if (st != null) st.close();
        if (pst != null) pst.close();
        if (con != null) con.close();
    }
%>
</table>

<p><a href="coffeeForm.jsp">⬅️ Go back to Update Form</a></p>

</body>
</html>
