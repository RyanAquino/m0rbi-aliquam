<?php 

$dbhost = 'localhost';
$dbuser = 'root';
$dbpass = '';
$dbname = 'tutorial';

$connect = new mysqli($dbhost,$dbuser,$dbpass,$dbname)
		or die("Connection failed: ");
//check connection
 ?>