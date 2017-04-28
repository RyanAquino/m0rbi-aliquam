<?php 

$dbhost = 'localhost';
$dbuser = 'root';
$dbpass = '';
$dbname = 'accounts';

$connect = new mysqli($dbhost,$dbuser,$dbpass,$dbname)
		or die("Connection failed: ");
//check connection
 ?>