<?php
include "inc/connection.php";
$i = 0;
$squery = "SELECT * FROM service where category = 'music'";
$servicequery = mysqli_query($connect, $squery);
$serviceqcount = mysqli_num_rows($servicequery);
?>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>





<?php
while ($i < $serviceqcount){
$row = mysqli_fetch_array($servicequery);
if ($i == 0){

?>
<div class="panel panel-danger">
    <div class="panel-heading">
    <?php echo $row['category'];?>
    </div>
    </div>
<ul>

<?php
}
	
	$ssquery = "SELECT username FROM service ";
    $sservicequery = mysqli_query($connect, $ssquery);
	?>
	<li><?php echo $row['description'];?></li>
	<?php
$i++;} 
?>

</ul>	
</body>
</html>

