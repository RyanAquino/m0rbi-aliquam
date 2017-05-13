<%-- insert pag hindi pa siya nakalogin // wala pa siyang cookie here--%>

<%-- 
    Document   : NoSession
    Created on : 05 11, 17, 1:13:16 AM
    Author     : Mai Radie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<jsp:include page="WEB-INF/fragments/header.html"/>

<body>
    <!-- Preloader -->
    <section id="wrapper" class="error-page">
        <div class="error-box">
            <div class="error-body text-center">
                <h1 class="text-danger">OOPS!</h1>
                <h3 class="text-uppercase">You are not logged in yet :(</h3>
                <p class="text-muted m-t-30 m-b-30">Please login first.</p>
                <a href="index.jsp" class="btn btn-danger btn-rounded waves-effect waves-light m-b-40">Back to home</a> </div>
            <footer class="footer text-center">2017 © Ample Admin.</footer>
        </div>
    </section>
    <!-- jQuery -->
    <script src="../plugins/bower_components/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="bootstrap/dist/js/bootstrap.min.js"></script>
</body>

</html>
