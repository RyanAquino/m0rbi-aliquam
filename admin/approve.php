<?php 
include "inc/connection.php";
                        
     if(isset($_POST['approved'])){
       	$updateStat = "UPDATE client set reg_status = 'approve' where username=$_POST[approved]";
         $changeStatus = mysqli_query($connect,$updateStat);
               header("location:requests.php");    
             }

 ?>