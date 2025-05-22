<%--Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and Generate
the report as follows for the table Emp (Emp_NO , Emp_Name, Basicsalary ) using HTML and JSP
to get the field and display the results respectively--%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<html>
<body>

<!-- Form to insert employee details -->
<h2>Enter Employee Details</h2>
<form method="post">
  Emp No: <input type="text" name="empno"/><br/>
  Emp Name: <input type="text" name="empname"/><br/>
  Basic Salary: <input type="text" name="salary"/><br/>
  <input type="submit" value="Insert Employee"/>
</form>

<%
    // Insert employee record when form is submitted
    if(request.getParameter("empno") != null) {
        int empno = Integer.parseInt(request.getParameter("empno"));
        String empname = request.getParameter("empname");
        int salary = Integer.parseInt(request.getParameter("salary"));
        
        try {
            // Database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", "");
            
            // SQL insert query
            PreparedStatement ps = con.prepareStatement("INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)");
            ps.setInt(1, empno);
            ps.setString(2, empname);
            ps.setInt(3, salary);
            
            // Execute insert query
            int i = ps.executeUpdate();
            if(i > 0) {
                out.println("<h3>Employee inserted successfully.</h3>");
            }
            
            con.close();
        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
%>

<hr>

<!-- Button to generate the salary report -->
<h2>Salary Report for Employees with Name Starting with 'R'</h2>
<form method="get">
    <input type="submit" value="Generate Report"/>
</form>

<%
    // Generate the salary report when the "Generate Report" button is clicked
    if(request.getMethod().equalsIgnoreCase("get")) {
        try {
            // Database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee1", "root", "");
            
            // Query to fetch employees whose name starts with 'R'
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Emp WHERE Emp_Name LIKE 'R%'");

            int grandSalary = 0;
            
            out.println("<hr>");
            while(rs.next()) {
                int empno = rs.getInt("Emp_NO");
                String empname = rs.getString("Emp_Name");
                int salary = rs.getInt("Basicsalary");
                
                // Display employee details
                out.println("Emp_No: " + empno + "<br>");
                out.println("Emp_Name: " + empname + "<br>");
                out.println("Basic Salary: " + salary + "<br>");
                out.println("<hr>");
                
                // Calculate grand salary
                grandSalary += salary;
            }
            
            out.println("<h3>Grand Salary: " + grandSalary + "</h3>");
            
            con.close();
        } catch (Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
%>

</body>
</html>
