<?php 
include('connection.php');
session_start();

$user_check = $_SESSION['login_user'];

	$sql = "SELECT * FROM users WHERE user_type = '$user_check'";
	//query from dbase.
	$mySession = mysqli_query($connect, $sql);
	$myResult=mysqli_fetch_assoc($mySession);


	if (!isset($myResult)) {
		mysqli_close($connect);
		header("Location: index.php");
	}


 ?>
