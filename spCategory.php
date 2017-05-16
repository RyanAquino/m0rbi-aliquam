<?php 
include "inc/connection.php";

		if (isset($_GET['regService'])) {
			// $queryService = "SELECT * FROM service";
			// $connectServe = mysqli_query($connect,$queryService);
			// $serviceRow = mysqli_fetch_array($connectServe);

			$addService = "INSERT INTO service (description,category) VALUES ('$_GET[catChoice]','$_GET[spServe]')";
			$serviceQ = mysqli_query($connect,$addService);


			}	
 
 ?>
 
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
	

	<form action="" method="GET">
	<label>
	Category
	<select name="catChoice">
		
				<?php 
				$ctr = 0;
				$queryChoice = mysqli_query($connect,"SELECT * FROM category");

				//num of rows
				$countChoice = mysqli_num_rows($queryChoice);
					?>

				<option value="">Choose a Category</option>
				<?php
				while ($ctr < $countChoice){
				$rowChoice = mysqli_fetch_array($queryChoice);
				?>
				
				<option value=<?php echo $rowChoice['category']; ?>> <?php echo $rowChoice['category']; ?></option>

				<?php
				$ctr++;
				}

				
				 ?>

	</select>
	</label>


	<label>
	Service
    <input type="text" placeholder="Service" name = "spServe" required/>
	</label>
	 <button type="submit" name="regService">Register</button>

	</form>


</body>
</html>