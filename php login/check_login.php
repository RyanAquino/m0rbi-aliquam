<?php
//set to variable.
//check if variable is set.
if(isset($_POST['submit'])){

	if(isset($_POST['username'],$_POST['password'])){
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
	$sql = "SELECT * FROM admin_table WHERE user_name = '$myusername' AND user_pass = SHA('$mypassword')";
	//query from dbase.
	$result = mysqli_query($connect, $sql);
	//count rows. if == 1 then it exist.
	$count=mysqli_num_rows($result);

	if($count == 1){
		$_SESSION['name'] = $myusername;
		$_SESSION['password'] = $mypassword;

		if($myusername == 'admin' && $mypassword =='admin'){
			header("location:admin.php");
		}else{
			echo "this is client";
		}
	}else{
		$msg = "Wrong Username or Password. Please retry";
		echo $msg;
	}
	ob_end_flush(); //clear buffer.

	}else{
		header("location:index.php");
	}


}

