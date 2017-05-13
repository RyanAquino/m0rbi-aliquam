<?php 
include('inc/check_login.php');

if(isset($_SESSION['user_id']) && isset($_SESSION['user_name'])){
  $tempId = $_SESSION['user_id'];
  $tempName = $_SESSION['user_name'];

  include('inc/connection.php');

  $sql1 = "SELECT * FROM admin WHERE username = '$tempName'";
  $sql2 = "SELECT * FROM client WHERE username = '$tempName'";
  $sql3 = "SELECT * FROM sp WHERE username = '$tempName'";

  $queryClient = mysqli_query($connect, $sql2);
  $queryAdmin = mysqli_query($connect, $sql1);
  $querySp = mysqli_query($connect, $sql3);


  $sessionClient = mysqli_num_rows($queryClient); 
  $sessionAdmin = mysqli_num_rows($queryAdmin);
  $sessionSp = mysqli_num_rows($querySp);


  $fetchClient = mysqli_fetch_assoc($queryClient);
  $fetchAdmin = mysqli_fetch_assoc($queryAdmin);
  $fetchSp = mysqli_fetch_assoc($querySp);

  if($sessionClient == 1){
  if (isset($fetchClient)) {
    header("Location:client.php");

  }
}else if ($sessionSp == 1){

  if (isset($fetchSp)) {
    header("Location:sprovider.php");

  }

}else if($sessionAdmin == 1){
  if (isset($fetchAdmin)) {
    header("Location:admin.php");

  }


}

}


 ?>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Flat Login Form</title>  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
  <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'>
  <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Montserrat:400,700'>
  <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
  <link rel="stylesheet" href="css/style.css">  
</head>

<body>
  
<div class="container">
  <div class="info">
    <h1>Flat Login Form</h1><span>Made with <i class="fa fa-heart"></i> by <a href="http://andytran.me">Andy Tran</a></span>
  </div>
</div>

<div class="form">
  <div class="thumbnail"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/169963/hat.svg"/></div>

  <form class="login-form" method="POST" action="">
    <input type="text" placeholder="username" name="username" />
    <input type="password" placeholder="password" name="password" />
    <button type="submit" name="submit">login</button>
    <p class="message">Not registered? <a href="signup.php">Create an account</a></p>
  </form>

</div>
<video id="video" autoplay="autoplay" loop="loop" poster="polina.jpg">
  <source src="http://andytran.me/A%20peaceful%20nature%20timelapse%20video.mp4" type="video/mp4"/>
</video>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="js/index.js"></script>

</body>
</html>
