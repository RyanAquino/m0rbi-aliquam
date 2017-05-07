<?php
    $servername = "localhost";
    $username = $_POST['name'];
    $password = $_POST['pass'];
    $dbname = "tutorial";


    $conn = mysqli_connect($servername, "root", "", $dbname) or die ("error");

    $myusername = stripslashes($username);
	$mypassword = stripslashes($password);
    

	$myusername = mysqli_real_escape_string($conn, $myusername);
	$mypassword = mysqli_real_escape_string($conn, $mypassword);
    session_start();    
    $query = "SELECT CONCAT(lastname, ', ', firstname) as name FROM sp WHERE username = '$myusername' AND password = '$mypassword'" ;
    
    $result = mysqli_query($conn, $query);
    $row = mysqli_fetch_array($result);
    $conn = mysqli_close($conn);
    

?>

<?php
    $conn = mysqli_connect($servername, "root", "", $dbname) or die ("error");
    $query = "SELECT sp_id FROM sp WHERE username = '$myusername'";

    $result = mysqli_query($conn, $query);
    $temp = mysqli_fetch_array($result);
    $spid = $temp['sp_id'];

    $query = "SELECT COUNT(request_id) as pending FROM request WHERE sp_id = '$spid' AND status = 'pending'";
    $result = mysqli_query($conn, $query);
    $pendRequest = mysqli_fetch_array($result);
    $conn = mysqli_close($conn);
?>

<!DOCTYPE html>
<html>
<head>
    <title>dashboard</title>
</head>
<body>
    
    <p>name: 
        <?php 
        echo $row['name']; 
        ?></p>
    <p>pending requests:
        <?php
        echo $pendRequest['pending'];
        ?></p>
</body>
</html>