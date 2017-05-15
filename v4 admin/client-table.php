<?php
include "inc/connection.php";
?>
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <title>Document</title>
      <link rel="stylesheet" href="css/scroll-table.css">
      <link rel="icon" href="img/apple.ico"> 
  </head>
  <body>
   
    <div class="panel panel-danger">
    <div class="panel-heading">
    Customers
    </div>
    </div>
   <div class="panel-body" id="table-wrapper">
   <div class="table-responsive" id="table-scroll">
    <table class="table table-striped table-hover">
     
        <?php
            $i = 0;
            $queryall = "SELECT * FROM client where reg_status = 'approve'";
            $clientqueryall = mysqli_query($connect, $queryall);
            $querycount = mysqli_num_rows($clientqueryall);
            ?>
            <thead>
                <th><p class = "text">First Name</p></th>
                <th><p class = "text">Last Name</p></th>
                <th><p class = "text">Username</p></th>
                <th><p class = "text">Address</p></th>
                <th><p class = "text">Contact</p></th>
                <th><p class = "text">Email</p></th>
                <th><p class = "text">Gender</p></th>
                
            </thead>


            <?php
            while ($i < $querycount){
            $row = mysqli_fetch_array($clientqueryall);
            $query = "SELECT username FROM client";
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
                   </tr>
              <?php $i++;} ?>
    </table>

    </div>
    </div>
      
  </body>
  </html>