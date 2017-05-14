<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="classes.Category"%>
<%@ page import = "classes.ServiceProvider" %>
<%@ include file = "includes/header.jsp" %>
<%@ page import = "classes.Generate" %>

<%ServiceProvider spInfo = (ServiceProvider)request.getAttribute("serviceProvider"); %>
<%String name = (String)request.getAttribute("firstName");%>
<%String lastName = (String)request.getAttribute("lastName");%>


<div id="page-wrapper" style="min-height: 674px;">
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
                            <div class="user-bg">
                                <div class="overlay-box">
                                    <div class="user-content">
                                        <a href="javascript:void(0)">
                                        <h4 class="text-white"><%out.print(spInfo.getLastName()); %></h4>
                                        <h5 class="text-white"><%out.print(spInfo.getEmail()); %></h5> </div>
                                </div>
                            </div>
                        </div>
                                    
                        
                        <div class="white-box">
                                    <button type="submit" class="btn-rounded btn btn-default btn-outline" style="margin-left:10%">
                                    <i class="fa fa-pencil-square-o fa-fw"></i><a href="edit-profile.html"> Message</a></button>
                                    <button type="submit" class="btn-rounded btn btn-default btn-outline">
                                    <i class="fa fa-pencil-square-o fa-fw"></i><a href="/tutorplus/Request?req= <%out.print(name);  %>>">Request</a></button>
                                <br>
                                <br>
                        
                        </div>
                            
                              <div class="white-box">
                        <h2 class="box-title">Schedule</h2>
                            <table class="table">
                                    <form action="checkbox"></form>
                                    <tbody>                                    
                                        <tr>
                                            <td>Monday</td>
                                            <td>10:00-11:00</td>
                                        </tr>                                        <tr>
                                            <td>Tuesday</td>
                                            <td>Not Available</td>
                                        </tr>                                        <tr>
                                            <td>Wednesday</td>
                                            <td>Not Available</td>
                  
                                        
                                    </tbody>
                                    
                            </table>
                        </div>
                    </div>
                   
             
                     <div class="col-md-8 col-xs-12">
                        <div class="white-box">
                            <h3 class="box-title">Full Name</h3>
                            <p><% out.print(spInfo.getFirstName());out.print(spInfo.getLastName());%></p>
                            
                            <h3 class="box-title">Contact Number</h3>
                            <p><% out.print(spInfo.getContact());%></p>
                               
                            <h3 class="box-title">Services Offered</h3>
                            <p><c:forEach var="category" items="${serviceProvider.subjList}">
                            	<c:out value="${category}"/>
                            	</c:forEach>
                            
                            </p>
                            
                           
                            
                     </div>
                         
                         <div class="form-group">
                                <div class="col-sm-12">
                                    
                                    
                                </div>
                            </div>
                    </div>
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
            <footer class="footer text-center"> 2017 © Tutor A+ brought to you by Group 3 </footer>
        </div>
                <%@ include file = "includes/footer.jsp" %>