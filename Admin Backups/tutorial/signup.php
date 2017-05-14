<?php
    include 'connection.php';
    session_start();
    if(isset($_SESSION['login_user'])){ 
        header("location:index.php");
    }else if(isset($_POST['register'])){
        $usertype = $_POST['usertype'];
        $firstname = $_POST['firstname'];
        $lastname = $_POST['lastname'];
        $username = $_POST['username'];
        $password = $_POST['userpassword'];
        $password2 = $_POST['userpassword2'];
        $email = $_POST['useremail'];
        if($password == $password2){
            $password = sha1($password);
            $sql = "INSERT INTO users(user_type,user_name,user_pass,email,firstname,lastname) VALUES ('$usertype','$username','$password','$email','$firstname','$lastname')";
            if(mysqli_query($connect,$sql)){
                header("location:index.php");
            
            }else{
                echo"error";
            }
            
        }
    }
?>
    <!DOCTYPE html>
    <html>

    <body>

        <head>
            <title>Signup</title>
            <link rel="stylesheet" type="text/css" href="signup.css">
        </head>

        <body>
            <div class="container">
                <div class="col-md-6">
                    <div id="logbox">
                        <form id="signup" method="post" action="signup.php">
                            <h1>create an account</h1>
                            <input name="username" type="text" placeholder="What's your username?" pattern="^[\w]{3,16}$" autofocus="autofocus" required="required" class="input pass" />
                            <input name="firstname" type="text" placeholder="What's your First Name?"  autofocus="autofocus" required="required" class="input pass" />
                            <input name="lastname" type="text" placeholder="What's your Last Name?"  autofocus="autofocus" required="required" class="input pass" />
                            <input name="userpassword" type="password" placeholder="Choose a password" required="required" class="input pass" />
                            <input name="userpassword2" type="password" placeholder="Confirm password" required="required" class="input pass" />
                            <input name="useremail" type="email" placeholder="Email address" class="input pass" />
                            <select name="usertype">
                              <option value="sp">Service Provider</option>
                              <option value="client">Client</option>    
                            </select>
                            <input type="submit" name="register" value="Sign me up!" class="inputButton" />
                            <div class="text-center">
                                already have an account? <a href="index.php" id="login_id">login</a>
                            </div>
                        </form>
                    </div>
                </div>
        </body>

    </html>