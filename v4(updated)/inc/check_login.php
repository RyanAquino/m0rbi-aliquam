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
//===========================================================================
	//check if acount is approved sp
	$sqlCheck = "SELECT * FROM sp WHERE reg_status = 'approve' AND (BINARY username = '$myusername' AND password = SHA('$mypassword'))";
	$sqlCheckQuery = mysqli_query($connect, $sqlCheck);
	$sqlCountResult = mysqli_num_rows($sqlCheckQuery);

	//check if acount is approved client
	$sqlCheck1 = "SELECT * FROM client WHERE reg_status = 'approve' and (BINARY username = '$myusername' AND password = SHA('$mypassword'))";
	$sqlCheckQuery2 = mysqli_query($connect, $sqlCheck1);
	$sqlCountResult3 = mysqli_num_rows($sqlCheckQuery2);

//===========================================================================

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

			if ($sqlCountResult >= 1 ) {
				$rowsSp = mysqli_fetch_array($resultSp);
    		    $_SESSION['user_id'] = $rowsSp['sp_id'];
    		    $_SESSION['user_name'] = $rowsSp['username'];
				header("location:http://192.168.1.9:6969/dashboard?username=" . $username);
			}else{
                echo "<div class='alert'>"; 
                echo "Account not approved or your account has been banned by the admin!";
                echo "</div>";
			}
	

	}else if ( $countClient == 1){

			if ( $sqlCountResult3 >= 1) {
				$rowsClient = mysqli_fetch_array($resultClient);
				$_SESSION['user_id'] = $rowsClient['client_id'];
				$_SESSION['user_name'] = $rowsClient['username'];
			
			header("location:http://192.168.1.13:8080/tutorplus/LandingPage?test=" . $rowsClient['client_id'] );
			}else{
				echo "Account not approve or your account has been banned by the admin!";
			}
	
	


		
	}else if($countAdmin >= 1){

			$rowsAdmin= mysqli_fetch_array($resultAdmin);
			$_SESSION['user_id'] = $rowsAdmin['id'];
			$_SESSION['user_name'] = $rowsAdmin['username'];

			header("location:admin.php"); 
	
	}else{
            echo "<div class='alert'>"; 
            echo "Wrong Username of Password. Please try again.";
            echo "</div>";
	}


	mysqli_close($connect);
	ob_end_flush(); //clear buffer.

	}else{
		//header("location:index.php");
	}


}
