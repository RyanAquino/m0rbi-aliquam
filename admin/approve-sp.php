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
            <div class="panel-heading"> Service Providers </div>
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
                                <p class="text">Category</p>
                            </th>
                            <th>
                                <p class="text">Service</p>
                            </th>
                            <th>
                                <p class="text">Status</p>
                            </th>
                        </thead>
                        <?php
            while ($i < $querycount){
            $row = mysqli_fetch_array($clientqueryall);
            $query = "SELECT username FROM sp";
            $clientquery = mysqli_query($connect, $query);
                ?>
                            <tr>
                                <td>
                                    <?php echo $row[3];?>
                                </td>
                                <td>
                                    <?php echo $row[2];?>
                                </td>
                                <td><b><?php echo $row[5];?></b></td>
                                <td>
                                    <?php echo $row[9];?>
                                </td>
                                <td>
                                   <?php echo $row[8];?>
                                </td>
                                <td>
                                    <?php echo $row['category'];?>
                                </td>
                                <td>
                                    <?php echo $row['description'];?>
                                </td>
                                <td>
                                    <?php echo $row[1];?>
                                </td>

                                <td>
                                <form method="POST">
                                   <button type="submit" class="btn btn-success" name="approved1"  value=<?php echo $row[5]; ?>>Accept</button>
                                   <button type="submit" class="btn btn-danger" name="decline2"  value=<?php echo $row[5]; ?>>Decline</button>
                                </form> 
                                </td>
                            </tr>
                            <?php $i++;} 

                          if(isset($_POST['approved1'])){
                        $updateStat = "UPDATE sp set reg_status = 'approve' where username = '$_POST[approved1]'";
                         $changeStatus = mysqli_query($connect,$updateStat);
                           }else if (isset($_POST['decline2'])){
                        $updateStat = "UPDATE sp set reg_status = 'reject' where username = '$_POST[decline2]'";
                         $changeStatus = mysqli_query($connect,$updateStat);
                  
                           }



                            ?>
                </table>
            </div>
        </div>
    </body>

    </html>