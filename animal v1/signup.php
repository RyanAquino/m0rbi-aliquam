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
            header("location: spCategory.php");
             
             

             
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
            echo "<div class='alert'>";
            echo "This is an alert box.";
            echo "</div>";
            
            
            echo "<script>alert('Please choose a role.')</script>";
        }

      }
        }
      
?>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Mansanas Tutorials</title>
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">

  <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'>
<link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Montserrat:400,700'>
<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
      <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="icon" href="img/apple.ico"> 
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>
  
<div class="container">
  <div class="info">
    <h1>Mansanas Tutorial</h1>
  </div>
</div>

<div class="animal">
  <div class="asd"><img src="img/applelogo.png"/></div>

  <form class="form" method="POST">
    <input type="text" placeholder="Firstname" name = "firstname" required/>
    <input type="text" placeholder="Lastname" name = "lastname" required/>
    <input type="text" placeholder="Home address" name = "address" required/>
    <input type="email" placeholder="Email addres" name = "email" required/>
    <input type="number" placeholder="Contact number" name = "contact" required/>


    <input type="text" placeholder="Username" name = "username" required/>
    <input type="password" placeholder="Password" name = "userpassword" minlength="6" required/>
    <input type="password" placeholder="Re enter password" name = "userpassword2" required/>

     <select name="usertype">
       <option value="choose">Choose role:</option>
       <option value="sp">Service Provider</option>
       <option value="client">Client</option>    
     </select>
         <br><br>
      
      <div class="radio-class">   
       <input type="radio" name = sex value = male  class="radio" id="radio1" required/>
       <label for="radio1">I am a Male</label>
       </div>
       <div class="radio-class"> 
       <input type="radio" name = sex value = female  class="radio" id="radio2" required/>
       <label for="radio2">I am a Female</label>
        </div>
   
     

    <button type="submit" name="register" data-toggle="modal" data-target="#butu">Register</button>
    <p class="message">Already registered? <a href="index.php">Sign In</a></p>
  </form>

</div>
 
 <div class="container">
  <!-- MUSIC MODAL -->
  <div class="modal fade" id="butu" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Music</h4>
        </div>
        <div class="modal-body">

<p>asdasdbga</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
  </div>
</div>
 
 
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="js/index.js"></script>

</body>
</html>
