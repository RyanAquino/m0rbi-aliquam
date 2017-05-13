<?php 
include('connection.php');
session_start();

$user_check = $_SESSION['user_id'];
$userCheck_name = $_SESSION['user_name'];

if(!isset($user_check) && !isset($userCheck_name)){
	header("Location:index.php");
}
 ?>




