<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

            <%
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial", "root", "");

                String s = request.getParameter("search");
                Statement st = con.createStatement();
                ResultSet rs;
                rs = st.executeQuery("select * from service where category='"+s+"'");

                while (rs.next()){
            %>
        <table cellpadding="4" cellspacing="4">
            <tr>
                <td><%= rs.getString("service_id")%></td>

                <td><%= rs.getString("category")%></td>

                <td><%= rs.getString("description")%></td>
             </tr>
        </table>
        <%
            }
        %>

    </body>
</html>