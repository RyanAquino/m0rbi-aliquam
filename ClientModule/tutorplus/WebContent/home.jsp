<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="classes.Category"%>
<%@ include file = "includes/header.jsp" %>
<%@ page import = "classes.Generate" %>
<%ArrayList<Category> categList = (ArrayList<Category>)request.getAttribute("categList"); %>
<%ArrayList<String> nameList = new ArrayList<String>();
	String name = null;
	for( int i = 0 ; i < categList.size(); i++){
		name = categList.get(i).getCategory();
		nameList.add(name);
	}
	request.setAttribute("nameList",nameList);
	request.setAttribute("parame", request.getParameter("cat"));
	%> 
<% ArrayList<String> servList = new ArrayList<String>();
	
%>



<%ArrayList<String> servLists = (ArrayList<String>)request.getAttribute("servList"); 
	request.setAttribute("lists",servLists);
%>

        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row bg-title">
                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                        <h4 class="page-title">Dashboard</h4> </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <!-- ============================================================== -->
                <!-- Different data widgets -->
                <!-- ============================================================== -->
                <!-- .row -->
                <div class="row">
                
                
             
    				 
    				 <% 
    				 	if(categList.size() > 0 ){
	    				 	for ( int i = 0; i < categList.size();i++){
	    					 out.print(Generate.generateMainBoard(categList.get(i).getCategory(),categList.get(i).getNumService()));
	    				 	}
    				 	}
    				 %>		
    				 
	 
					<!--PLACE LOOP FOR GENERATING CODE CATEGORIES HERE -->

                <div class="row">
                    <div class="col-md-12 col-lg-12 col-sm-12">
                   

					<!-- place drowpdown loop code here -->
					
					<c:set  var = "param" value="null"/>
      <c:if test = "${not empty param }">
      					<div class="white-box">
                            <div class="col-md-3 col-sm-4 col-xs-6 pull-right">
                                <select class="form-control pull-right row b-none">
							        <c:forEach var="category" items="${categList}">
							        <c:if test = "${parame == category.category }">
										
								      	<c:forEach var="list" items = "${category.servList}">
								      	<option><c:out value ="${list}"></c:out></option>
								      	</c:forEach>										
									</c:if> 
									</c:forEach>                               
                                </select>
                            </div>
                            <h3 class="box-title"><c:out value = "${parame}" ></c:out></h3>  
                    </div>
                    
                  <div class="white-box">
                                <h3 class="box-title">Instructors</h3>
                            <div class="table-responsive">
                                <div class="col-md-4 col-xs-12">
                        <div class="white-box">
                            
                            <div class="user-bg"> 
                            <!-- Start of user div -->
                            
                                <div class="overlay-box">
                                    <div class="user-content">
                                                <h5 class="text-white">Danielle Saringan</h5>
                                                <a href="javascript:void(0)"><img src="../plugins/images/users/genu.jpg" class="thumb-lg img-circle" alt="img"></a>
                                                <h6 class="text-white">If your looking someone ...</h6>
                                                <a href="viewtutor.html"><button type="click">View tutor</button></a>
                                    </div>
                                </div>
                            <!-- End of user div -->
                            
                            
                            </div>
                        </div>
                        </div><table class="table">
                                    
                    </table>
                    </div>
             
            </div>
                    
                    
                    
                     
      </c:if>	
                          <!-- /.col -->
                          
                </div>
            </div>
            <!-- /.container-fluid -->
<%@ include file = "includes/footer.jsp" %>