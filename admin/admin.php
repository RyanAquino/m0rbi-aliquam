<?php
    include 'inc/session.php';
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
        <title>Mansanas Tutorials</title>
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
        <div class="navbar navbar-inverse set-radius-zero">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                    <div> <img class="mansanas" src="assets/img/mansanas.png" /> </div>
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
                                <li><a class="menu-top-active" href="admin.php">Dashboard</a></li>
                                <li><a href="requests.php">Manage Users</a></li>
                                <li><a href="addcategory.php">Categories</a></li>
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
                        <h4 class="page-head-line">Dashboard</h4> </div>
                </div>
                <div class="row">
                    <div class="col-md-3 col-sm-3 col-xs-6" data-toggle="modal" data-target="#subCatAcad">
                        <div class="dashboard-div-wrapper bk-clr-one">
                            <h5>Academics </h5> <i class="fa fa-book dashboard-div-icon"></i> </div>
                    </div>
                    <div class="col-md-3 col-sm-3 col-xs-6" data-toggle="modal" data-target="#subCatSports">
                        <div class="dashboard-div-wrapper bk-clr-two">
                            <h5>Sports </h5> <i class="fa fa-futbol-o dashboard-div-icon"></i> </div>
                    </div>
                    <div class="col-md-3 col-sm-3 col-xs-6" data-toggle="modal" data-target="#subCatMusic">
                        <div class="dashboard-div-wrapper bk-clr-three">
                            <h5>Music </h5> <i class="fa fa-music dashboard-div-icon"></i> </div>
                    </div>
                    <div class="col-md-3 col-sm-3 col-xs-6" data-toggle="modal" data-target="#subCatMisc">
                        <div class="dashboard-div-wrapper bk-clr-four">
                            <h5>Misc </h5> <i class="fa fa-asterisk dashboard-div-icon"></i> </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <?php
                include "search.php";
                include 'client-table.php';
                ?>
                            <?php
                include 'sp-table.php';
                include 'transactions.php'

                ?>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <!-- ACADEMICS MODAL-->
            <div class="modal fade" id="subCatAcad" role="dialog">
                <div class="modal-dialog">
                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Academics</h4> </div>
                        <div class="modal-body">
                            <?php
            include "inc/connection.php";
$i = 0;
$squery = "SELECT * FROM service where category = 'academics'";
$servicequery = mysqli_query($connect, $squery);
$serviceqcount = mysqli_num_rows($servicequery);
        ?>
                                <?php
while ($i < $serviceqcount){
$row = mysqli_fetch_array($servicequery);
?>
                                    <ul>
                                        <?php
	
	$ssquery = "SELECT username FROM service ";
    $sservicequery = mysqli_query($connect, $ssquery);
	?>
                                            <li>
                                                <?php echo $row['description'];?>
                                            </li>
                                            <?php
    $i++;} 
    ?>
                                    </ul>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <!-- SPORTS MODAL -->
            <div class="modal fade" id="subCatSports" role="dialog">
                <div class="modal-dialog">
                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Sports</h4> </div>
                        <div class="modal-body">
                            <?php
include "inc/connection.php";
$i = 0;
$squery = "SELECT * FROM service where category = 'sports'";
$servicequery = mysqli_query($connect, $squery);
$serviceqcount = mysqli_num_rows($servicequery);
?>
                                <?php
while ($i < $serviceqcount){
$row = mysqli_fetch_array($servicequery);
?>
                                    <ul>
                                        <?php
	
	$ssquery = "SELECT username FROM service ";
    $sservicequery = mysqli_query($connect, $ssquery);
	?>
                                            <li>
                                                <?php echo $row['description'];?>
                                            </li>
                                            <?php
$i++;} 
?>
                                    </ul>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <!-- MUSIC MODAL -->
            <div class="modal fade" id="subCatMusic" role="dialog">
                <div class="modal-dialog">
                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Music</h4> </div>
                        <div class="modal-body">
                            <?php
include "inc/connection.php";
$i = 0;
$squery = "SELECT * FROM service where category = 'music'";
$servicequery = mysqli_query($connect, $squery);
$serviceqcount = mysqli_num_rows($servicequery);
?>
                                <?php
while ($i < $serviceqcount){
$row = mysqli_fetch_array($servicequery);
?>
                                    <ul>
                                        <?php
	
	$ssquery = "SELECT username FROM service ";
    $sservicequery = mysqli_query($connect, $ssquery);
	?>
                                            <li>
                                                <?php echo $row['description'];?>
                                            </li>
                                            <?php
$i++;} 
?>
                                    </ul>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <!-- MISC MODAL -->
            <div class="modal fade" id="subCatMisc" role="dialog">
                <div class="modal-dialog">
                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Miscellaneous</h4> </div>
                        <div class="modal-body">
                            <?php
include "inc/connection.php";
$i = 0;
$squery = "SELECT * FROM service where category = 'misc'";
$servicequery = mysqli_query($connect, $squery);
$serviceqcount = mysqli_num_rows($servicequery);
?>
          <?php
while ($i < $serviceqcount){
$row = mysqli_fetch_array($servicequery);
?>
                                    <ul>
                                        <?php

	$ssquery = "SELECT * FROM `service` where NOT category = 'music' AND NOT category = 'sports' AND NOT category = 'academics' ";
    $sservicequery = mysqli_query($connect, $ssquery);
	?>
                                            <li>
                                                <?php echo $row['description'];?>
                                            </li>
                                            <?php
$i++;} 
?>
                                    </ul>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- CONTENT-WRAPPER SECTION END-->
        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-md-12"> &copy; 2017 Mansanas </div>
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