<?php 
include('session.php');
if($_SESSION['login_user']=='admin'){
?>
<!DOCTYPE html>
	<html lang='en'>
	<head>
		<meta charset='UTF-8'>
		<title>Document</title>

	</head>
	<body>
	<?php echo "hi"; ?>
		<h1>Welcome ADMIN! </h1>
		<a href='logout.php'>Logout</a>
		<div class="content">
		    
		  <?php
            $sql = "SELECT * FROM admin_table";
            $result = mysqli_query($connect,$sql);
            if(mysqli_num_rows($result) > 0){
                while($row = mysqli_fetch_assoc($result)){
                    echo "id" .  $row["id"] . "Name" . $row["firstname"] . " " . $row["lastname"]. "<br>";
                }else{
                    echo "0 results";
                }
            }

            
            
            ?>  
		    
		    
		</div>
	</body>
	</html>	
<?php	
}else
header("location:index.php");
?>