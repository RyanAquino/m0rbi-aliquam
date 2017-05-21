<%-- 
    Document   : Transactions
    Created on : 05 13, 17, 3:10:31 AM
    Author     : Mai Radie
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="beans.Transactions"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file = "includes/header.jsp" %>
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row bg-title">
                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                            <li class="active">Transactions</li>
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

                                <!--------------------------------------------------->


                                <h3 class="box-title">Transactions</h3>
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>Transaction ID</th>
                                                <th>Date</th>
                                                <th>Status</th>
                                                <th>Amount</th>
                                            </tr>
                                        </thead>
                                        <tbody>


                                            <% ArrayList<Transactions> tList = (ArrayList<Transactions>) request.getAttribute("transactions"); %>

                                            <% for(int i = 0; i < tList.size(); i++) { %>
                                            <tr> 
                                                <td><%= tList.get(i).getTransaction_id() %></td>
                                                <td><%= tList.get(i).getDate() %></td>
                                                <td><%= tList.get(i).getPaid() %></td>
                                                <td><%= tList.get(i).getAmount() %></td>

                                            </tr>
                                            <% } %>



                                        </tbody>

                                </table>
                            </div>

                        </div>
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
