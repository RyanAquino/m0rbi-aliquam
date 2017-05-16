<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
	<form action="" method="post">
	<input type="text" name=search >
	<button type="submit" name=submit value=submit>Search</button>
	</form>
	<br>
		
	<?php
	try{
	if(isset($_POST['search'])){
	?>	
	<div class="panel panel-danger">
    <div class="panel-heading">
    Search Result:
    </div>
    </div>
       
  

   <div class="panel-body" id="table-wrapper">
   <div class="table-responsive" id="table-scroll">

	<table class="table table-striped table-hover">

	<?php 
		$i =0;
			$keyword = $_POST['search'];
            $queryclient = "SELECT * FROM client";
            $clientall = mysqli_query($connect, $queryclient);
            $clientcount = mysqli_num_rows($clientall);
            $querysp = "SELECT * FROM sp";
            $spall = mysqli_query($connect, $querysp);
            $spcount = mysqli_num_rows($spall);

	 		$searchclient = "SELECT * from client WHERE username like '%$keyword%' or firstname like '%$keyword%' or lastname like '%$keyword%'
					  or email like '%$keyword%' ";
			$searchsp = "SELECT * from sp WHERE username like '%$keyword%' or firstname like '%$keyword%' or lastname like '%$keyword%'
					  or email like '%$keyword%' "; 
			$clientRes = mysqli_query($connect, $searchclient);
			$spRes =  mysqli_query($connect, $searchsp);
			$c_searchCount = mysqli_num_rows($clientRes);
			$sp_searchCount = mysqli_num_rows($spRes);
		if($c_searchCount > 0 || $sp_searchCount > 0){
			echo "<thead>";	
			echo "<th><p class = 'text'> First Name </p></th>";
			echo "<th><p class = 'text'> Last Name </p></th>";
			echo "<th><p class = 'text'> Username </p></th>";
			echo "<th><p class = 'text'> Address </p></th>";
			echo "<th><p class = 'text'> Email </p></th>";
			echo "<th><p class = 'text'> Gender </p></th>";
			echo "</thead>";
		}else{
			echo "No Results Found.";
		}
	?>
	<?php
		$j = 0;
	 		while ($i < $clientcount || $i < $spcount){
	 			while ($j < $c_searchCount || $j < $sp_searchCount ){
	 				
	 				if($c_searchCount > 0){
			 			$c_row = mysqli_fetch_array($clientRes);
			 			echo "<tr>";
			 			echo "<td>" . $c_row['firstname'] . "</td>";
			 			echo "<td>" . $c_row['lastname'] . "</td>";
			 			echo "<td>" . $c_row['username'] . "</td>";
			 			echo "<td>" . $c_row['address'] . "</td>";
			 			echo "<td>" . $c_row['email'] . "</td>";
			 			echo "</tr>";
			 			$j++;
			 		}
			 		if ($sp_searchCount > 0) {
			 			$sp_row = mysqli_fetch_array($spRes);
			 			echo "<tr>";
			 			echo "<td>" . $sp_row['firstname'] . "</td>";
			 			echo "<td>" . $sp_row['lastname'] . "</td>";
			 			echo "<td>" . $sp_row['username'] . "</td>";
			 			echo "<td>" . $sp_row['address'] . "</td>";
			 			echo "<td>" . $sp_row['email'] . "</td>";
			 			echo "</tr>";
			 			$j++;
			 		}
			 		                                       
	 		}
	 			
	
    	$i++;} }
        } catch (Exception $e){
        	echo "Error: " . $e;
        }
    ?>


	</table>
	</div>
	</div>
	
</body>
</html>