<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="classes.Category"%>
<%@ page import="classes.ServiceProvider"%>
<%@ include file="includes/header.jsp"%>
<%@ page import="classes.Generate"%>

<%
	ServiceProvider spInfo = (ServiceProvider) request.getAttribute("serviceProvider");
%>
<%
	String name = (String) request.getAttribute("firstName");
%>
<%
	String lastName = (String) request.getAttribute("lastName");
%>


<div id="page-wrapper" style="min-height: 674px;">
	<div class="container-fluid">
		<div class="row bg-title">
			<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
				<h4 class="page-title">Profile page</h4>
			</div>
			<div class="col-lg-10 col-sm-8 col-md-8 col-xs-12">
				<ol class="breadcrumb">
					<li><a href="#">Dashboard</a></li>
					<li class="active">Profile Page</li>
				</ol>
			</div>
		</div>
		<!-- /.row -->
		<!-- .row -->
		<div class="row">
			<div class="col-md-6 col-xs-12">
				<div class="white-box">
					<div class="user-bg">
						<div class="overlay-box">
							<div class="user-content">
								<a href="javascript:void(0)">
									<h4 class="text-white">
										<%
											out.print(spInfo.getLastName());
										%>
									</h4>
									<h5 class="text-white">
										<%
											out.print(spInfo.getEmail());
										%>
									</h5>
							</div>
						</div>
					</div>
				</div>


				<div class="white-box col-lg-12">
					<h2 class="box-title">SCHEDULE</h2>
					<table class="table">
						<form action="checkbox"></form>
						<tbody>
							<c:forEach var="schedule" items="${schedList}">
								<tr>
									<td><c:out value="${schedule.day}" /></td>
									<td><c:out value="${schedule.time}" /></td>

									<td>
									<form method="GET" action="${pageContext.request.contextPath}/Request"><div class="form-group">
											<label for="sel1">Select list:</label> <select
												class="form-control" id="sel1" name="num">
												<option value="1">1</option>
												<option value="2">2</option>
												<option value="3">3</option>
												<option value="4">4</option>
											</select>
											
										</div></td>
										<td><input type="hidden" name="schedId" value="${schedule.schedId}"></td>
									<td><button type="submit" name="spId" value="${servId}"
											class="btn-rounded btn btn-default btn-outline">
											<i class="fa fa-pencil-square-o fa-fw"></i>Request
										</button>
									</td></form>										
								</tr>


							</c:forEach>

						</tbody>

					</table>
				</div>
			</div>


			<div class="col-md-6 col-xs-12">
				<div class="white-box">
					<h3 class="box-title">Full Name</h3>
					<p>
						<%
							out.print(spInfo.getFirstName());
							out.print(spInfo.getLastName());
						%>
					</p>

					<h3 class="box-title">Contact Number</h3>
					<p>
						<%
							out.print(spInfo.getContact());
						%>
					</p>

					<h3 class="box-title">Services Offered</h3>
					<p>
						<c:forEach var="category" items="${serviceProvider.subjList}">
							<c:out value="${category}" />
						</c:forEach>

					</p>
				</div>
				<div class="form-group">
					<div class="col-sm-12"></div>
				</div>
			</div>
		</div>
		<!-- /.row -->
	</div>
	<!-- /.container-fluid -->
	<footer class="footer text-center"> 2017 © Tutor A+ brought to
		you by Group 3 </footer>
</div>
<%@ include file="includes/footer.jsp"%>