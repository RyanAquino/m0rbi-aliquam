<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="beans.Message"%>
<%@page import="java.util.HashMap"%>
<%@ include file = "includes/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Check Box Test</title>
    </head>
    <body>
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row bg-title">
                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                        <h4 class="page-title"></h4> </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                            <li class="active">Messages</li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->
                <!-- .row -->
                <div class="row">
                    <div class="row">
                        <div class="col-md-12 col-lg-12 col-sm-12">
                            <div class="white-box">
                                <div class="col-md-3 col-sm-4 col-xs-6 pull-right">
                                </div>
                                <h3 class="box-title">Messages</h3>
                                <a href=""><button class="btn btn-success" style="float: right">Compose a Message</button></a>
                                <div class="comment-center p-t-10">
                                    <% // String spid = (String) request.getParameter("spid"); %>
                                    <% //request.setAttribute("spid", spid);%> 
                                    <% // String client_id = (String) request.getAttribute("client_id"); %>

                                    <%
                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");

                                            String connUrl = "jdbc:mysql://localhost:3306/tutorial?user=root&password=";
                                            Connection conn = DriverManager.getConnection(connUrl);

                                            String sql3 = "select concat(firstname, \" \", lastname), sp_id from sp natural join request where client_id = 1 and reg_status LIKE 'approve'";
                                            Statement st = conn.createStatement();

                                            ResultSet rs = st.executeQuery(sql3);
                                    %>

                                    <form action="Reply" method="get">
                                        <table align="center">
                                            <tr>
                                                <td>Select An Item :</td>
                                                <td> <select name="sp">
                                                        <%  while (rs.next()) {%>
                                                        <option value="<%= rs.getString(2)%>"><%= rs.getString(1)%></option>
                                                        <% } %>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <input class="form-control send-message" placeholder="Write a message..." name="rep"/>
                                                <td><input type="submit" value="Send"></td>
                                                <td></td>
                                            </tr>
                                        </table>
                                    </form>

                                    <%

                                        } catch (Exception e) {
                                            out.println("wrong entry" + e);
                                        }
                                    %>
                                    <!--                        
                                        </body>
                                    </html>
                                     </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- /.row -->
                                </div>
                                <!-- /.container-fluid -->
                                <footer class="footer text-center"> 2017 &copy; Mansanas Tutorials brought to you by Group 3 </footer>
                            </div>
                            <!-- /#page-wrapper -->

                            <!-- /#wrapper -->
                            <!-- jQuery -->
                            <script src="../plugins/bower_components/jquery/dist/jquery.min.js"></script>
                            <!-- Bootstrap Core JavaScript -->
                            <script src="bootstrap/dist/js/bootstrap.min.js"></script>
                            <!-- Menu Plugin JavaScript -->
                            <script src="../plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
                            <!--slimscroll JavaScript -->
                            <script src="js/jquery.slimscroll.js"></script>
                            <!--Wave Effects -->
                            <script src="js/waves.js"></script>
                            <!-- Custom Theme JavaScript -->
                            <script src="js/custom.min.js"></script>
                            </body>

                            </html>


