<?php
    include 'inc/connection.php';
    session_start();

    if(isset($_POST['addcat'])) {
        
    $category = $_POST['catname'];
    $description = $_POST['desc'];

        $newCat = "INSERT INTO category (
        category,
        description
        ) values (
        '$category',
        '$description'
        )";
        
        
        $addcategory = mysqli_query($connect, $newCat);
      echo "<div class='alert'>";
            echo "<span class='closebtn' onclick='this.parentElement.style.display='none';'>&times;</span>"; 
            echo "Category added.";
            echo "</div>";
    }else if (isset($_POST['clearVal'])){
        header:"location:addcategory.php";
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
    <title>Mansanas Tutorials</title>
    <!-- BOOTSTRAP CORE STYLE  -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME ICONS  -->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link rel="icon" href="img/apple.ico"> 
    <link href="assets/css/style.css" rel="stylesheet" />
    
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
                            <li><a href="admin.php">Dashboard</a></li>
                            <li><a href="requests.php">Account Requests</a></li>
                            <li><a class="menu-top-active" href="addcategory.php">Add Category</a></li>
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
                        <h1 class="page-head-line">Add New Category</h1>
                    </div>
                </div>
                
                <div class="panel panel-danger">
                        <div class="panel-heading">
                            Categories
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped  table-hover">
                                   
                                    <?php
                                    $i = 0;
            $queryall = "SELECT * FROM category";
            $clientqueryall = mysqli_query($connect, $queryall);
            $querycount = mysqli_num_rows($clientqueryall);
                                    ?>
                                    
                                    <thead>
                                        <tr>
                                            <th>Category</th>
                                            <th>Description</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                       
                                       <?php
                                         while ($i < $querycount){
            $row = mysqli_fetch_array($clientqueryall);
            $query = "SELECT username FROM category";
            $clientquery = mysqli_query($connect, $query);
                                        
                                        ?>
                                        <tr>
                                            <td><?php echo $row['category'];?></td>
                                            <td><?php echo $row['description'];?></td>
                                            <?php $i++;} ?>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                
                <div class="asd">
                    
        <div class="panel panel-danger">
                    <div class="panel-heading">
                        Category 
                    </div>
                    <div class="panel-body">
                        <form method="POST">
                            
                        <label>Category Name : </label>
                        <input type="text" class="form-control" name="catname" required/>
                        <label>Enter Description : </label>
                        <textarea rows="9" class="form-control" name="desc"></textarea>
                        <hr />
                        <button class="btn btn-warning" name = "clearVal"><span class="fa fa-times-circle" aria-hidden="true"></span> Clear Values </button>&nbsp;
                      <button type="submit" class="btn btn-success" name="addcat"><span class="fa fa-plus-circle" aria-hidden="true"    ></span>  Add Category </button>
                        </form>
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
