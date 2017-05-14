<?php

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

//===========================================================================
	//check if acount is approved sp
	$sqlCheck = "SELECT * FROM sp WHERE reg_status = 'approve'";
	$sqlCheckQuery = mysqli_query($connect, $sqlCheck);
	$sqlCountResult = mysqli_num_rows($sqlCheckQuery);

	//check if acount is approved client
	$sqlCheck1 = "SELECT * FROM client WHERE reg_status = 'approve'";
	$sqlCheckQuery2 = mysqli_query($connect, $sqlCheck1);
	$sqlCountResult3 = mysqli_num_rows($sqlCheckQuery2);

//===========================================================================

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

        // if($sqlCountResult > 1){
		header("location:http://192.168.1.16:6969/dashboard/");
			// }

	}else if ( $countClient == 1){

		$rowsClient = mysqli_fetch_array($resultClient);
		$_SESSION['user_id'] = $rowsClient['client_id'];
		$_SESSION['user_name'] = $rowsClient['username'];
		$temp = $_SESSION['user_name'];
		$_POST = $temp;

		$url = 'location:http://192.168.1.13:8080/tutorplus/HomePage?param=1';

		 if ($sqlCountResult3 >= 1) {
			header("location:http://192.168.1.13:8080/tutorplus/HomePage?param=1");
		 }
	

	}else if($countAdmin >= 1){
			$rowsAdmin= mysqli_fetch_array($resultAdmin);
			$_SESSION['user_id'] = $rowsAdmin['id'];
			$_SESSION['user_name'] = $rowsAdmin['username'];

			header("location:admin.php"); 
	
	}else{
        echo "<div class='alert'>";
            echo "<span class='closebtn' onclick='this.parentElement.style.display='none';'>&times;</span>"; 
            echo "Wrong Username of Password. Please try again.";
            echo "</div>";
	}


	mysqli_close($connect);
	ob_end_flush(); //clear buffer.

	}else{
		//header("location:index.php");
	}


}
