<%-- 
    Document   : messages
    Created on : 05 12, 17, 5:49:59 AM
    Author     : Mai Radie
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="beans.Message"%>
<%@page import="java.util.HashMap"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList"%>
<%@ include file = "includes/header.jsp" %>
<!-- ============================================================== -->
<!-- Page Content -->
<!-- ============================================================== -->
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
                        <a href="WriteMessage"><button class="btn btn-success" style="float: right">Compose a Message</button></a>
                        <div class="comment-center p-t-10">

                            <% String spid = (String) request.getAttribute("spid"); %>
                            <% request.setAttribute("spid", spid);%> 
                            <%  String client_id = (String) request.getAttribute("client_id"); %>

                            <%
                                try {
                                    ResultSet resultset = null;

                                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/tutorial?user=root&password=");

                                    Statement statement = connection.createStatement();

                                    resultset = statement.executeQuery("select concat(firstname, \" \", lastname) from sp natural join request where client_id = 1 and reg_status LIKE 'approve'");
                            %>


                                <select>
                                    <%  while (resultset.next()) {%>
                                    <option><%= resultset.getString(1)%></option>
                                    <% } %>
                                </select>


                            <%
                                    //**Should I input the codes here?**
                                } catch (Exception e) {
                                    out.println("wrong entry" + e);
                                }
                            %>



                            <div class="send-wrap ">
                                <form action="Reply?sp=<%=spid%>" method="post" id="rep">
                                    <input class="form-control send-message" placeholder="Write a message..." name="rep"/>
                                    <input type="hidden" class="form-control send-message" name="spid" value="<%=spid%>"/>
                                    <div class="btn-panel pull-right">
                                        <a href="Reply?sp=<%=spid%>" class=" col-lg-4 text-center btn send-message-btn pull-in" role="button"><button type="submit" class="btn-rounded btn btn-default btn-outline"><i class="fa fa-send"></i> Send Message</button></a>
                                    </div>
                                </form>

                            </div>




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


