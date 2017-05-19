<%-- 
    Document   : Profile
    Created on : May 14, 2017, 6:52:38 PM
    Author     : Duke
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session = request.getSession(false);
    if (session != null && session.getAttribute("userName") != null) {

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0);

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial", "root", "");
        String userId = (String) session.getAttribute("userName");
        String sql = "SELECT * FROM client where client_id = " + userId;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        String name = null;
        String lastname = null;
        String email = null;
        String password = null;
        String address = null;
        String username = null;
        String contact = null;
        if (rs.next()) {
            name = rs.getString("firstname");
            lastname = rs.getString("lastname");
            email = rs.getString("email");
            contact = rs.getString("contact");
            password = rs.getString("password");
            address = rs.getString("address");
            username = rs.getString("username");
        }
        
        request.setAttribute("name", name);
        request.setAttribute("lastname", lastname);
  
%>      
<%@ include file = "includes/header.jsp" %>
<!-- ============================================================== -->
<!-- End Left Sidebar -->
<!-- ============================================================== -->
<!-- ============================================================== -->
<!-- Page Content -->
<!-- ============================================================== -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div class="row bg-title">
            <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                <h4 class="page-title">Profile page</h4> </div>
            <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                <ol class="breadcrumb">
                    <li><a href="#">Dashboard</a></li>
                    <li class="active">Profile Page</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->
        <!-- .row -->
        <div class="row">
            <div class="col-md-4 col-xs-12">
                <div class="white-box">
                    <div class="user-bg"> <img width="100%" alt="user" src="plugins/images/large/img1.jpg">
                        <div class="overlay-box">
                            <div class="user-content">
                                <a href="javascript:void(0)"><img src="plugins/images/users/genu.jpg" class="thumb-lg img-circle" alt="img"></a>
                                <h4 class="text-white"><%=username%></h4>
                                <h5 class="text-white"><%=email%></h5> </div>
                        </div>
                    </div>

                </div>
            </div>

            <div class="col-md-8 col-xs-12">
                <div class="white-box">
                    <form class="form-horizontal form-material">
                        <div class="form-group">
                            <label class="col-md-12">Full Name</label>
                            <div class="col-md-12">
                                <p><%=name%> <%=lastname%></p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="example-email" class="col-md-12">Email</label>
                            <div class="col-md-12">
                                <p><%=email%></p>  </div>
                        </div>
                        <div class="form-group">
                            <label for="example-email" class="col-md-12">Address</label>
                            <div class="col-md-12">
                                <p><%=address%></p>  </div>
                        </div>
                        <div class="form-group">
                            <label for="example-email" class="col-md-12">Contact</label>
                            <div class="col-md-12">
                                <p><%=contact%></p>  </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-12">
                                <button class="btn btn-success"><i class="fa fa-edit fa-fw"></i><a href="EditProf.jsp">Edit Profile</a></button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- /.row -->
    </div>
    <!-- /.container-fluid -->
    <footer class="footer text-center"> 2017 &copy; Ample Admin brought to you by wrappixel.com </footer>
</div>
<!-- /#page-wrapper -->

<!-- /#wrapper -->
<!-- jQuery -->
<script src="plugins/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Menu Plugin JavaScript -->
<script src="plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
<!--slimscroll JavaScript -->
<script src="js/jquery.slimscroll.js"></script>
<!--Wave Effects -->
<script src="js/waves.js"></script>
<!-- Custom Theme JavaScript -->
<script src="js/custom.min.js"></script>
</body>  
</html>
<%
    } else {
        response.sendRedirect("NoSession.jsp");
    }
%>