<?php 
include "inc/connection.php";

		if (isset($_GET['regService'])) {
			$addService = "INSERT INTO service (description,category) VALUES ('$_GET[spServe]','$_GET[catChoice]')";
			$serviceQ = mysqli_query($connect,$addService);
			header("location:index.php");


		}	
 
 ?>
 
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Mansanas Tutorials</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">

  <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'>
<link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Montserrat:400,700'>
<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
      <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="icon" href="img/apple.ico"> 
      <link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
  <div class="info">
    <h1>SP Category</h1>
  </div>
</div>
<div class="animal">
    <div class="asd"><img src="img/applelogo.png"/></div>
    
    
	<form class="asd" method="GET">
	<div class="row">
	    
	<div class="col-md-5">
	    
	
	<label>
	Category
        </label>
	</div>
	
	<div class="col-md-5">
	    
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
	</div>
	</div>
<br>
<br>
<div class="row">
    
<div class="col-md-5">
    
	<label>
	Service
	</label>
</div>
   
   <div class="col-md-5">
       
    <input type="text" placeholder="Service" name = "spServe" required/>
   </div>
</div>
 <br><br>
	 <button type="submit" name="regService">Register</button>

	</form>
</div>


</body>
</html>