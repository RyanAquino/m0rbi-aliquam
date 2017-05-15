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

    <div class="panel-body" id="table-wrapper">
<div class="table-responsive" id="table-scroll">
<table class="table table-striped table-hover">
<?php
}
	
	$ssquery = "SELECT username FROM service ";
    $sservicequery = mysqli_query($connect, $ssquery);
	?>
	<tr>
	<td><?php echo $row['description'];?></td>
	</tr>
	<?php
$i++;} 
?>

</table>
</div>
</div>	
</body>
</html>

