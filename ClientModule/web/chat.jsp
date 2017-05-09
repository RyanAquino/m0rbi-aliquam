<%-- 
    Document   : chat
    Created on : 05 8, 17, 11:11:01 AM
    Author     : Mai Radie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <h2>Handling Request Parameters (POST)</h2>
        <form action="MessageServlet" method="GET" enctype="multipart/form-data">
            <p>Search Service Provider:<br>
                <input type="text" name="sp_name" required>
            </p>
            
        </form>
    </body>
</html>
