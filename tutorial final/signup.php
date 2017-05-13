<?php
    include 'inc/connection.php';
    session_start();



    if(isset($_SESSION['user_id'])){ 
        header("location:index.php");
    }else if(isset($_POST['register'])){

        $firstname = $_POST['firstname'];
        $lastname = $_POST['lastname'];
        $address = $_POST['address'];
        $email = $_POST['email'];
        $contact = $_POST['contact'];

        $gender = $_POST['sex'];
        if($gender == "male"){
            $gender = 'm';
        }else{
            $gender = 'f';
        }

        $username = $_POST['username'];
        $password = $_POST['userpassword'];
        $password2 = $_POST['userpassword2'];

       if($password == $password2){ 
        if($_POST['usertype'] == "sp"){

            $spReg = "INSERT INTO sp (
            firstname,
            lastname,
            address,
            gender,
            username,
            password,
            email,
            contact
            ) values (
            '$firstname',
            '$lastname',
            '$address',
            '$gender',
            '$username',
            sha('$password'),
            '$email',
            '$contact'
            )";     

          $allClient = mysqli_query($connect,"SELECT username FROM client WHERE username = '$username'");
          $allSpAccounts = mysqli_query($connect,"SELECT username FROM sp WHERE username = '$username'");
  
         if(mysqli_num_rows($allSpAccounts) >= 1 || mysqli_num_rows($allClient) >= 1  ){
               echo "Username already taken! Please Try Again.";
          }else{
             $registerSp = mysqli_query($connect, $spReg); 
             header("location:index.php"); 
          }
            
          
             
        }else if($_POST['usertype'] == "client"){

            $clientReg = "INSERT INTO client (
            lastname,
            firstname,
            address,
            gender,
            username,
            password,
            email,
            contact
            ) values (
            '$lastname',
            '$firstname',
            '$address',
            '$gender',
            '$username',
            sha('$password'),
            '$email',
            '$contact'
            )";

          $allClient = mysqli_query($connect,"SELECT username FROM client WHERE username = '$username'");
          $allSpAccounts = mysqli_query($connect,"SELECT username FROM sp WHERE username = '$username'");

         if(mysqli_num_rows($allClient) >= 1 || mysqli_num_rows($allSpAccounts) >= 1){
              echo "Username already taken! Please Try Again.";
         }else{
            $registerClient = mysqli_query($connect, $clientReg);    
            header("location:index.php");
            }
            
        }else{
            echo "<script>alert('Please choose a role.')</script>";
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

  <form class="form" method="POST">
    <input type="text" placeholder="Firstname" name = "firstname" required/>
    <input type="text" placeholder="Lastname" name = "lastname" required/>
    <input type="text" placeholder="Home address" name = "address" required/>
    <input type="email" placeholder="Email addres" name = "email" required/>
    <input type="number" placeholder="Contact number" name = "contact" required/>

   <label>Male<input type="radio" name = sex value = male required/></label>
   <label>Female<input type="radio" name = sex value = female required/></label>

    <input type="text" placeholder="Username" name = "username" required/>
    <input type="password" placeholder="Password" name = "userpassword" minlength="6" required/>
    <input type="password" placeholder="Re enter password" name = "userpassword2" required/>

     <select name="usertype">
       <option value="choose">Choose role:</option>
       <option value="sp">Service Provider</option>
       <option value="client">Client</option>    
     </select>

    <button type="submit" name="register">Register</button>
    <p class="message">Already registered? <a href="index.php">Sign In</a></p>
  </form>

</div>
<!-- <video id="video" autoplay="autoplay" loop="loop" poster="polina.jpg">
  <source src="http://andytran.me/A%20peaceful%20nature%20timelapse%20video.mp4" type="video/mp4"/>
</video> -->
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="js/index.js"></script>

</body>
</html>
