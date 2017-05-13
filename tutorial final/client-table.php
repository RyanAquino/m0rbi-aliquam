<?php

$dbhost = 'localhost';
$dbuser = 'root';
$dbpass = '';
$dbname = 'tutorial';

$connect = new mysqli($dbhost,$dbuser,$dbpass,$dbname)
        or die("Connection failed: ");
//check connection  

//if(isset($_SESSION['user_id']) && isset($_SESSION['user_name'])){
//  $tempId = $_SESSION['user_id'];
//  $tempName = $_SESSION['user_name'];

 //ss include('inc/connection.php');

 

?>
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <title>Document</title>
  </head>
  <body>
   
    <div class="panel panel-default">
    <div class="panel-heading">
                            Customers
                        </div>
   <div class="panel-body">
   <div class="table-responsive">
    <table class="table table-striped table-hover">
      
       
        <?php
            $i = 0;
            $queryall = "SELECT * FROM client";
            $clientqueryall = mysqli_query($connect, $queryall);
            $querycount = mysqli_num_rows($clientqueryall);
            ?>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Address</th>
                <th>Gender</th>
            </tr>
            <?php
            while ($i < $querycount){
            $row = mysqli_fetch_array($clientqueryall);
            $query = "SELECT username FROM client";
            $clientquery = mysqli_query($connect, $query);
                ?>
                   <tr>
                   <td><?php echo $row['firstname'];?></td>
                   <td><?php echo $row['lastname'];?></td>
                   <td><?php echo $row['address'];?></td>
                   <td><?php echo $row['gender'];?></td>
                   </tr>
              <?php $i++;} ?>
    </table>

       </div>   
    </div>    
   </div>
      
  </body>
  </html>