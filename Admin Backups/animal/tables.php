<?php
include "inc/connection.php";
?>
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <title>Document</title>
  </head>
  <body>

    <table>
        <?php
            $i = 0;
            $queryall = "SELECT * FROM client";
            $clientqueryall = mysqli_query($connect, $queryall);
            $querycount = mysqli_num_rows($clientqueryall);
            

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

      
  </body>
  </html>