<%@ page import="java.sql.*" %>

<html>
<head>
    <title>Coffee Records</title>
</head>
<body>

<%
    String idStr = request.getParameter("id");
    String name = request.getParameter("coffee_name");
    String priceStr = request.getParameter("price");

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

        if (idStr != null && name != null && priceStr != null &&
            !idStr.isEmpty() && !name.isEmpty() && !priceStr.isEmpty()) {

            int id = Integer.parseInt(idStr);
            double price = Double.parseDouble(priceStr);

            String insertQuery = "INSERT INTO coffee (id, coffee_name, price) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(insertQuery);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setDouble(3, price);
            pstmt.executeUpdate();
            pstmt.close();
        }

        String selectQuery = "SELECT * FROM coffee";
        pstmt = conn.prepareStatement(selectQuery);
        rs = pstmt.executeQuery();
%>

<h2>Coffee Products</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Coffee Name</th>
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
        out.println("Error: " + e.getMessage());
    } finally {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }
%>
</table>

<!-- Optional form to add new coffee -->
<h3>Add New Coffee</h3>
<form method="get" action="">
    ID: <input type="text" name="id"><br>
    Coffee Name: <input type="text" name="coffee_name"><br>
    Price: <input type="text" name="price"><br>
    <input type="submit" value="Add Coffee">
</form>

</body>
</html>