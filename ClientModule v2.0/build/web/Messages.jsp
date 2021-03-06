<%-- 
    Document   : messages
    Created on : 05 12, 17, 5:49:59 AM
    Author     : Mai Radie
--%>
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
                        <a href="WriteMessage"><button class="btn-rounded btn btn-default btn-outline" style="float: right">Compose a Message</button></a>
                        <div class="comment-center p-t-10">

                            <% ArrayList<Message> m = (ArrayList<Message>) request.getAttribute("msgs"); %>
                            <% ArrayList<ArrayList<Message>> outer = (ArrayList<ArrayList<Message>>) request.getAttribute("outer"); %>
                            <% ArrayList<Message> inner = (ArrayList<Message>) request.getAttribute("inner"); %>

                            <% for (int x = 0; x < outer.size(); x++) {%>
                              
                            <!-------------------------------------------------------------------------------------------->
                            <!-- link ni aj here -->
                            
                            <a href="ViewMessages?id=<%= outer.get(x).get(0).getSp_id() %>" ><div class="comment-body">
                                    <div class="user-img"> <img src="../plugins/images/users/pawandeep.jpg" alt="user" class="img-circle">
                                    </div>
                                    <div class="mail-contnet">
                                        <h5><%= outer.get(x).get(0).getFirstname()%> <%= outer.get(x).get(0).getLastname()%></h5><span class="time">
                                            <%= outer.get(x).get(0).getDate() %>
                                        </span>
                                        <br/><span class="mail-desc"><%= outer.get(x).get(0).getMsg() %></span>  
                                    </div>
                                </div></a>

                            
                            <% }%>


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


