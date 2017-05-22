<?php
include "inc/connection.php";
?>
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <title>Document</title>
      <link rel="stylesheet" href="css/scroll-table.css">
  </head>
  <body>

    <div class="panel panel-danger">
    <div class="panel-heading">
     Transactions
    </div>
    </div>
   <div class="panel-body" id="table-wrapper">
   <div class="table-responsive" id="table-scroll">
    <table class="table table-striped table-hover">
		<?php
		$i = 0;
		$trnsct ="SELECT *
		FROM `client`  join `request`  join `sp` natural join transaction
		ON client.client_id = request.client_id 
		AND sp.sp_id = request.sp_id 
		AND transaction.request_id = request.request_id";

		$trnsctQ = mysqli_query($connect, $trnsct);
		$trnsctCount = mysqli_num_rows($trnsctQ);
		?>
		<thead>
			<th><p class = "text">Client</p></th>
			<th><p class = "text">Service Provider</p></th>
			<th><p class = "text">Payment(amount)</p></th>
			<th><p class = "text">Status</p></th>
			<th><p class = "text">Date</p></th>
		</thead>


		<?php
		 while ($i < $trnsctCount){
		            $row = mysqli_fetch_array($trnsctQ);
		            $query = "SELECT username FROM client";
		            $clientquery = mysqli_query($connect, $query);         
		?>
		<tr>
		<td><?php echo $row[2] . " " . $row[1] . " (" . $row[5] . ")";?></td>
		<td><?php echo $row[22] . " " . $row[21] . " (" . $row[25] . ")";?></td>
		<td><?php echo $row[32] . " (P" . $row[33] . ")";?></td>
		<td><?php echo $row[31];?></td>
		<td><?php echo $row[35];?></td>
		<td></td>
		</tr>
		<?php $i++;} ?>
    </table>
       </div>   
    </div>    
   
      
  </body>
  </html>