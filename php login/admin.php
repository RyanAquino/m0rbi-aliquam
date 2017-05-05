<?php 
include('session.php');
if($_SESSION['login_user']=='admin'){

echo "<!DOCTYPE html>
	<html lang='en'>
	<head>
		<meta charset='UTF-8'>
		<title>Document</title>

	</head>
	<body>
		<h1>Welcome ADMIN! </h1>
		<a href='logout.php'>Logout</a>
		
	</body>
	</html>	";
}else
header("location:index.php");
?>