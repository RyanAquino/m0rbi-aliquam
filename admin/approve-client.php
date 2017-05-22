<?php
include "inc/connection.php";

?>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <title>Mansanas Tutorials</title>
        <link rel="stylesheet" href="css/scroll-table.css">
        <link rel="icon" href="img/apple.ico"> </head>

    <body>
        <div class="panel panel-danger">
            <div class="panel-heading"> Customers </div>
        </div>

        <div class="panel-body" id="table-wrapper">

            <div class="table-responsive" id="table-scroll">

                <table class="table table-striped table-hover">
    <?php
            $i = 0;
            $queryall = "SELECT * FROM client";
            $clientqueryall = mysqli_query($connect, $queryall);
            $querycount = mysqli_num_rows($clientqueryall);
    ?>
                        <thead>
                            <th>
                                <p class="text">First Name</p>
                            </th>
                            <th>
                                <p class="text">Last Name</p>
                            </th>
                            <th>
                                <p class="text">Username</p>
                            </th>
                            <th>
                                <p class="text">Address</p>
                            </th>
                            <th>
                                <p class="text">Contact</p>
                            </th>
                            <th>
                                <p class="text">Email</p>
                            </th>
                            <th>
                                <p class="text">Status</p>
                            </th>
                        </thead>


          <?php
            while ($i < $querycount){
            $row = mysqli_fetch_row($clientqueryall);

            $query = "SELECT username FROM client";
            $clientquery = mysqli_query($connect, $query);
                ?>
                            <tr>
                                <td>
                                    <?php echo $row[2];?>
                                </td>
                                <td>
                                    <?php echo $row[1];?>
                                </td>
                                <td><b>
                   <?php 
                   echo $row[5];
                   // $userApprove = $row[5];
                      // echo $userApprove;

                   ?></b></td>
                                <td>
                                    <?php echo $row[3];?>
                                </td>
                                <td>
                                    <?php echo $row[9];?>
                                </td>
                                <td>
                                    <?php echo $row[7];?>
                                </td>
                                <td>
                                    <?php echo $row[10];?>
                                </td>
                                <td>

                                <form method="POST">
                                   <button type="submit" class="btn btn-success" name="approved" value=<?php echo $row[5]; ?>>Accept</button>
                                   <button type="submit" class="btn btn-danger" name="decline" value=<?php echo $row[5]; ?>>Reject</button>
                                </form>

                                </td>
                            </tr>
                            <?php $i++;}


				     if(isset($_POST['approved'])){
				       	$updateStat = "UPDATE client set reg_status = 'approve' where username = '$_POST[approved]'";
				         $changeStatus = mysqli_query($connect,$updateStat);
				     	   
				           }else if (isset($_POST['decline'])){
				       	$updateStat = "UPDATE client set reg_status = 'reject' where username = '$_POST[decline]'";
				         $changeStatus = mysqli_query($connect,$updateStat);
				  
				           }
 ?>
                </table>
            </div>
        </div>


    </body>

    </html>