<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="classes.Category"%>
<%@ page import = "classes.ServiceProvider" %>
<%@ include file = "includes/header.jsp" %>
<%@ page import = "classes.Generate" %>


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
                            <div class="user-bg"> <img width="100%" alt="user" src="../plugins/images/large/img1.jpg">
                                <div class="overlay-box">
                                    <div class="user-content">
                                        <a href="javascript:void(0)"><img src="../plugins/images/users/genu.jpg" class="thumb-lg img-circle" alt="img"></a>
                                        <h4 class="text-white">Katherine Turqueza</h4>
                                        <h5 class="text-white">kathturqueza@gmail.com</h5> </div>
                                </div>
                            </div>
                            <div class="user-btm-box">
                                <cite title="City, ST">
                                <i class="glyphicon glyphicon-map-marker"></i> City. ST
                                </cite>
                                <h3>Category: Arts, Music, Sports</h3>
                                <h4>2 reviews</h4> 
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
                                        </tr>                                        <tr>
                                            <td>Thursday</td>
                                            <td>10:00-11:00</td>
                                        </tr>                                        <tr>
                                            <td>Friday</td>
                                            <td>7:30-9:00</td>
                                        </tr>                                        <tr>
                                            <td>Saturday</td>
                                            <td>1:00-2:00</td>
                                        </tr>                                        <tr>
                                            <td>Sunday</td>
                                            <td>Not Available</td>
                                        </tr>
                                        
                                        
                                    </tbody>
                                    
                            </table>
                        </div>
                    </div>
                    </div>
             
                     <div class="col-md-8 col-xs-12">
                        <div class="white-box">
                            <form class="form-horizontal form-material">
                                <div class="form-group">
                                    <label class="col-md-12">Full Name</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Katherine Turqueza" class="form-control form-control-line"> </div>
                                </div>
                                <div class="form-group">
                                    <label for="example-email" class="col-md-12">E-mail</label>
                                    <div class="col-md-12">
                                        <input type="email" placeholder="kathturqueza@gmail.com" class="form-control form-control-line" name="example-email" id="example-email"> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Password</label>
                                    <div class="col-md-12">
                                        <input type="password" value="password" class="form-control form-control-line"> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Phone Number</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="09993456789" class="form-control form-control-line"> </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Biography and Experience</label>
                                    <div class="col-md-12">
                                        <textarea rows="5" class="form-control form-control-line">I luv calligraphy </textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Education</label>
                                    <div class="col-md-12">
                                        <input type="text" placeholder="Saint Louis University" class="form-control form-control-line"></div>
                                    </div>
                                </form></div>
                                <div class="form-group">
                                    <div class="col-sm-12">
                                        <a href="request.html"><button class="btn btn-success"><i class="fa fa-edit fa-fw" aria-hidden="true"></i>Request</button></a>
                                        <a href="request.html"><button class="btn btn-success"><i class="fa fa-envelope fa-fw" aria-hidden="true"></i>Message</button></a>
                                    
                                    </div>
                                </div>
                            
                        </div>
                    </div>
                </div>
                <!-- /.row -->
            </div>
                <%@ include file = "includes/footer.jsp" %>