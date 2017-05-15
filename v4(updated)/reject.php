<?php
	include "inc/connection.php";
?>

<?php
if (isset($_POST['rejectUser'])){

$unameReject = $_POST['approveDecline'];

$spStatus = "SELECT username FROM sp WHERE username = '$unameReject'"; 
$sp_statusQuery = mysqli_query($connect, $spStatus);
$sp_statusCount = mysqli_num_rows($sp_statusQuery);

$cStatus = "SELECT username FROM client WHERE username = '$unameReject'";
$c_statusQuery = mysqli_query($connect, $cStatus);
$c_statusCount = mysqli_num_rows($c_statusQuery);

	

		if($sp_statusCount > 0){
			$updateReject = "UPDATE sp SET reg_status = 'reject' where username = '$unameReject'";
			$updateRejected = mysqli_query($connect, $updateReject);
			echo "<div class='alertsuccess'>"; 
                echo "<p>User rejected</p>";
                echo "</div>";

		}
		if($c_statusCount > 0){
			$updateReject = "UPDATE client SET reg_status = 'reject' where username = '$unameReject'";
			$updateRejected = mysqli_query($connect, $updateReject);
			echo "<div class='alertsuccess'>"; 
                echo "<p>User rejected</p>";
                echo "</div>";

		}
}	

		
 
?>