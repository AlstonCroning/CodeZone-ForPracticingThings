<?php

//connection to the database
$link = mysqli_connect("localhost","root","a1xcr0nge","sampledatabase");

if(mysqli_connect_error()){
    die("Couldn't connect to database");
}

/*
//default SQL statement
//$query = "SELECT * FROM `users`";
*/

/*
//extracting data from the sampledatabase
$query = "SELECT * FROM `users` WHERE `name` LIKE '%th%'";
*/

/*
//updating some data
$query = "UPDATE `users` SET `email`='bethIO@gmail.com' WHERE `id`='7' LIMIT 1";
mysqli_query($link,$query);
*/


if($result = mysqli_query($link,$query)){
    while($row = mysqli_fetch_array($result)) {
        print_r($row);
    }
}


?>
