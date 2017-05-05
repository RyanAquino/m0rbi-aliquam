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
	$sql = "SELECT * FROM users WHERE user_name = '$myusername' AND user_pass = SHA('$mypassword')";
	//query from dbase.
	$result = mysqli_query($connect, $sql);
	//count rows. if == 1 then it exist.
	$count=mysqli_num_rows($result);	
	//get id of the user that login.
	$rows= mysqli_fetch_array($result);

	if($count == 1){
        $_SESSION['login_user'] = $rows['user_type'];
        $_SESSION['user_id'] = $rows['id'];
		if($myusername == 'admin' && $mypassword == 'admin'){
			
			header("location:admin.php"); 
		}else if ($rows['user_type'] == 'client'){
			header("location:client.php");
		}else if ($rows['user_type'] == 'sp'){
			header("location:client.php");		
		} 
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