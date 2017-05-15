<%-- 
    Document   : Save
    Created on : May 15, 2017, 12:09:42 AM
    Author     : Duke
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
                Statement s = null;
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial", "root", "");
                int userId = (Integer) session.getAttribute("userName");
                String sql = "SELECT * FROM client where client_id = " + userId + "";
	        Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                String clientid = null;
                String name = null;
	        String lastname = null;
                String email = null;
	        String password = null;
                String address = null;
                String username = null;
                String contact = null;
                    if(rs.next()){
                        clientid = rs.getString("client_id");
	            	name = rs.getString("firstname");
	            	lastname = rs.getString("lastname");
                        email = rs.getString("email");
                        contact = rs.getString("contact");
                        password = rs.getString("password");
                        address = rs.getString("address");
                        username = rs.getString("username");
                        
                    }
                    
                    s = conn.createStatement();
                    String newname = request.getParameter("name");
                    String newlastname = request.getParameter("lastname");
                    String newemail = request.getParameter("email");
                    String newpassword = request.getParameter("password");
                    String newcontact = request.getParameter("contact");

                       String sql1 = "UPDATE client " +"SET firstname = '"+ newname + "' " +
                               ", lastname = '"+ newlastname + "' " +
                               ", email = '"+ newemail + "' " + 
                               ", password = '"+ newpassword + "' " +
                               ", contact = '"+ newcontact +"' " +
                               " WHERE client_id = '" + clientid + "' ";
s.execute(sql1);

    String redirectURL = "http://localhost:8084/ClientModule/EditProf.jsp";
    response.sendRedirect(redirectURL);
%>
