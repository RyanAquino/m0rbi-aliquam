<?php
session_start();

if(isset($_POST['submit'])){
	if(!empty($_POST['username']) || !empty($_POST['password'])){

	$username = $_POST['username'];
	$password = $_POST['password'];

	ob_start();   // output buffer.
	include ('connection.php'); //dbase connect.

	//remove slashes('/') of the string. 
	$myusername = stripslashes($username);
	$mypassword = stripslashes($password);
	//escapes special characters in the string for use in SQL.
	$myusername = mysqli_real_escape_string($connect, $myusername);
	$mypassword = mysqli_real_escape_string($connect, $mypassword);

	//select from dbase.
	$sqlSp = "SELECT * FROM sp WHERE BINARY username = '$myusername' AND password = SHA('$mypassword')";

	$sqlClient = "SELECT * FROM client WHERE BINARY username = '$myusername' AND password = SHA('$mypassword')";

	$sqlAdmin =  "SELECT * FROM admin WHERE BINARY username = '$myusername' AND password = SHA('$mypassword')";

	//query from dbase.
	$resultSp = mysqli_query($connect, $sqlSp);
	$resultClient = mysqli_query($connect, $sqlClient);
	$resultAdmin = mysqli_query($connect, $sqlAdmin);

	//count rows. if == 1 then it exist.
	$countSp = mysqli_num_rows($resultSp);	
	$countClient = mysqli_num_rows($resultClient);	
	$countAdmin = mysqli_num_rows($resultAdmin);

	if($countSp == 1){

		$rowsSp = mysqli_fetch_array($resultSp);
        $_SESSION['user_id'] = $rowsSp['sp_id'];
        $_SESSION['user_name'] = $rowsSp['username'];
		header("location:../sprovider.php");

	}else if ( $countClient == 1){

		$rowsClient = mysqli_fetch_array($resultClient);
		$_SESSION['user_id'] = $rowsClient['client_id'];
		$_SESSION['user_name'] = $rowsClient['username'];
		header("location:client.php");

	}else if($countAdmin == 1){
			$rowsAdmin= mysqli_fetch_array($resultAdmin);
			$_SESSION['user_id'] = $rowsAdmin['id'];
			$_SESSION['user_name'] = $rowsAdmin['username'];
			header("location:admin.php"); 
		

	}else{
		$msg = "Wrong Username or Password. Please Try Again.";
		echo $msg;
	}


	mysqli_close($connect);
	ob_end_flush(); //clear buffer.
	}else{
		header("location:index.php");
	}


}
