<?php 
include('check_login.php');

if(isset($_SESSION['login_user'])){
  $temp = $_SESSION['login_user'];
  if ($temp == 'admin') {
  header("location: home.php");
  }else if($temp == 'client'){
    header("location:client.php");
  }else if ($temp == 'sp')
    header("location:sprovider.php"); 
}

 ?>



<!DOCTYPE html>
<html>
<head>
<title>Signin</title>
<link rel="stylesheet" type="text/css" href="login.css">
<link rel="stylesheet" type="text/js" href="login.js">
</head>
<body>
<div class="login-page">
  <div class="form">
    <form class="login-form" method="POST" action="">
      <input type="text" placeholder="username" name="username"/>
      <input type="password" placeholder="password" name="password"/>
      <button type="submit" name="submit">login</button>
      <p class="message">Not registered? <a href="signup.php">Create an account</a></p>
    </form>
  </div>
</div>
</body>
</html>