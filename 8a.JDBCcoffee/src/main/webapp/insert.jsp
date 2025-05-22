<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Dbconfig.jsp" %>
<%
    int empno = Integer.parseInt(request.getParameter("empno"));
    String empname = request.getParameter("empname");
    int salary = Integer.parseInt(request.getParameter("salary"));

    PreparedStatement ps = conn.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
    ps.setInt(1, empno);
    ps.setString(2, empname);
    ps.setInt(3, salary);
    int status = ps.executeUpdate();

    if (status > 0) {
        out.println("<h3>Employee added successfully!</h3>");
    } else {
        out.println("<h3>Error adding employee.</h3>");
    }
    conn.close();
%>
<a href="index.jsp">Back to Form</a>

</body>
</html>