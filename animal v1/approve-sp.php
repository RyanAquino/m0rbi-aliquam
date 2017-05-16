<?php
include "inc/connection.php";
?>
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <title>Mansanas Tutorials</title>
      <link rel="stylesheet" href="css/scroll-table.css">
      <link rel="icon" href="img/apple.ico"> 
  </head>
  <body>

    <div class="panel panel-danger">
    <div class="panel-heading">
                            Service Providers
    </div>
    </div>



   <div class="panel-body" id="table-wrapper">
   <div class="table-responsive" id="table-scroll">
    <table class="table table-striped table-hover">
        
        <?php
            $i = 0;
            $queryall = "SELECT * FROM sp /*left join rate*/ left join service  on 'sp.sp_id' = 'service.service_id'";
            $clientqueryall = mysqli_query($connect, $queryall);
            $querycount = mysqli_num_rows($clientqueryall);
            ?>
            
            <thead>
                <th><p class = "text">First Name</p></th>
                <th><p class = "text">Last Name</p></th>
                <th><p class = "text">Username</p></th>
                <th><p class = "text">Address</p></th>
                <th><p class = "text">Contact</p></th>
                <th><p class = "text">Category</p></th>
                <th><p class = "text">Service</p></th>
                <th><p class = "text">Status</p></th>
            </thead>
            
            <?php
            while ($i < $querycount){
            $row = mysqli_fetch_array($clientqueryall);
            $query = "SELECT username FROM sp";
            $clientquery = mysqli_query($connect, $query);
                ?>
                   <tr>
                   <td><?php echo $row['firstname'];?></td>
                   <td><?php echo $row['lastname'];?></td>
                   <td><b><?php echo $row['username'];?></b></td>
                   <td><?php echo $row['address'];?></td>
                   <td><?php echo $row['contact'];?></td>
                   <td><?php echo $row['category'];?></td>
                   <td><?php echo $row['description'];?></td>
                   <td><?php echo $row['reg_status'];?></td>
                   </tr>
              <?php $i++;} ?>
    </table>
       </div>   
    </div>    
   
      
  </body>
  </html>