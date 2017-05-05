<?php 
include('session.php');
if($_SESSION['login_user']=='client'){
echo "<!DOCTYPE html>
<html lang='en'>
<head>
	<meta charset='UTF-8'>
	<title>Client Page</title>
</head>
<body>

<h1>Hello Client!</h1>
<a href='logout.php'>Logout</a>
	
</body>
</html>";
}else
header("location:index.php");
 ?>

