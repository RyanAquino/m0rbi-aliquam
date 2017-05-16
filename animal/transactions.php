<table>
<?php
include "inc/connection.php";

$i = 0;
$trnsct ="SELECT *

FROM `client`  join `request`  join `sp` natural join transaction
ON client.client_id = request.client_id 
AND sp.sp_id = request.sp_id 
AND transaction.request_id = request.request_id";

$trnsctQ = mysqli_query($connect, $trnsct);
$trnsctCount = mysqli_num_rows($trnsctQ);


 while ($i < $trnsctCount){
            $rowtrnsct = mysqli_fetch_array($trnsctQ);
            $query = "SELECT username FROM client";
            $clientquery = mysqli_query($connect, $query);
            echo implode($rowtrnsct);            
?>
<tr>
<td><?php echo $rowtrnsct['firstname'] . " " . $rowtrnsct['lastname'] . " (" . $rowtrnsct[] . ")";?></td>
</tr>
<?php $i++;} ?>
</table>