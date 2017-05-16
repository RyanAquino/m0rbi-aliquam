<?php 
include 'inc/session.php';

if (isset($_POST['chooseApprove'])){

//Input of user to be approved.
$temp = $_POST['approveDecline'];

//for SP
$sqlApprove = "SELECT * FROM sp WHERE BINARY username = '$temp'";
$queryApprove = mysqli_query($connect, $sqlApprove);
$count = mysqli_num_rows($queryApprove);


$sqlApproveClient = "SELECT * FROM client WHERE BINARY username = '$temp'";
$queryApproveClient = mysqli_query($connect, $sqlApproveClient);
$countClient = mysqli_num_rows($queryApproveClient);

if($count == 1){
    $updateApprove = " UPDATE sp set reg_status = 'approve' where BINARY username = '$temp'";
    $updatedApproved = mysqli_query($connect, $updateApprove);
    echo "<div class='alertsuccess'>"; 
                echo "<p>SP Account Successfully Approved!</p>";
                echo "</div>";
}elseif($countClient == 1){
    $updateApproveC = " UPDATE client set reg_status = 'approve' where BINARY username = '$temp'";
    $updatedApprovedC = mysqli_query($connect, $updateApproveC);

    echo "<div class='alertsuccess'>"; 
                echo "<p>Client Account Successfully Approved!</p>";
                echo "</div>";

}else{
   				 echo "<div class='alert'>"; 
                echo "<p>User does not exist</p>";
                echo "</div>";
}

}else if (isset($_POST['rejectUser'])){
        include "reject.php";
}    

 ?>     


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <title>Free Responsive Admin Theme - ZONTAL</title>
    <!-- BOOTSTRAP CORE STYLE  -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME ICONS  -->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link href="assets/css/style.css" rel="stylesheet" />
    <link rel="icon" href="img/apple.ico"> 
     <!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
    
    <!-- HEADER END-->
    <div class="navbar navbar-inverse set-radius-zero">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                   <div>
                   <img class="mansanas" src="assets/img/mansanas.png"/>

                   </div>
                    

            </div>

            
        </div>
    </div>
    <!-- LOGO HEADER END-->
    <section class="menu-section">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="navbar-collapse collapse ">
                        <ul id="menu-top" class="nav navbar-nav navbar-right">
                            <li><a  href="admin.php">Dashboard</a></li>
                            <li><a class="menu-top-active" href="requests.php">Manage Users</a></li>
                            <li><a href="addcategory.php">Add Category</a></li>
                            <li><a href="inc/logout.php">Log out</a></li>

                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </section>
    <!-- MENU SECTION END-->
    <div class="content-wrapper">
        <div class="container">
            <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-head-line">Users</h1>
                    </div>
            </div>
                <div class="row">
                <div class="col-md-12">
                  	<?php include "approve-client.php";
                  	 ?>
                </div>
                </div>

				<div class="row">
                <div class="col-md-12">
                     <!--   Basic Table  -->
                    <?php include "approve-sp.php";
                  	 ?>
                </div>
                </div>
              
              <div class="asd">
                  
               <div class="col-md-10" >
                   
                <div class="panel panel-danger">
                    <div class="panel-heading">
                        Manage User 
                    </div>

                    <div class="panel-body">

					<form method="POST">
                        <div class="form-group has-success" >
                        <label class="control-label">USERNAME : </label>
                        <input type="text" class="form-control" name = "approveDecline" />
                        </div>
                        
                        <hr/>
                        <button class="btn btn-warning" name="rejectUser"><span class="fa fa-times" aria-hidden="true"></span> Reject </button>&nbsp;

                      <button class="btn btn-success" name="chooseApprove"><span class="fa fa-check" aria-hidden="true"></span>  Approve </button>
                    </form>

                    </div>

                </div>    
                </div>
              </div>
               </div>
            </div>
                
    <!-- CONTENT-WRAPPER SECTION END-->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    &copy; 2017 Mansanas
                </div>

            </div>
        </div>
    </footer>
    <!-- FOOTER SECTION END-->
    <!-- JAVASCRIPT AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
    <!-- CORE JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.11.1.js"></script>
    <!-- BOOTSTRAP SCRIPTS  -->
    <script src="assets/js/bootstrap.js"></script>
</body>
</html>
