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
                            Service Providers
                        </div>
   <div class="panel-body">
   <div class="table-responsive">
    <table class="table table-striped table-hover">
        <?php
            $i = 0;
            $queryall = "SELECT * FROM sp";
            $clientqueryall = mysqli_query($connect, $queryall);
            $querycount = mysqli_num_rows($clientqueryall);
            ?>
            
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
                <th>Address</th>
                <th>Contact</th>
                <th>Email</th>
                <th>Gender</th>
                <th>Status</th>
            </tr>
            
            <?php
            while ($i < $querycount){
            $row = mysqli_fetch_array($clientqueryall);
            $query = "SELECT username FROM sp";
            $clientquery = mysqli_query($connect, $query);
                ?>
                   <tr>
                   <td><?php echo $row['firstname'];?></td>
                   <td><?php echo $row['lastname'];?></td>
                   <td><?php echo $row['username'];?></td>
                   <td><?php echo $row['address'];?></td>
                   <td><?php echo $row['contact'];?></td>
                   <td><?php echo $row['email'];?></td>
                   <td><?php echo $row['gender'];?></td>
                   <td><?php echo $row['reg_status'];?></td>
                   </tr>
              <?php $i++;} ?>
    </table>
       </div>   
    </div>    
   </div>
      
  </body>
  </html>