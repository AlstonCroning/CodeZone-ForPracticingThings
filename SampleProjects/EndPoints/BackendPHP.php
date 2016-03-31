<?php

//headers
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");

//connection to database
$link = mysqli_connect("localhost","root","a1xcr0nge","sampledatabase");
if(mysqli_connect_error()) {
    die("Couldn't connect to DataBase");
}

//Data Interaction & Response
if($_SERVER['REQUEST_METHOD'] == "POST") {

    $comment = $_POST['inputComment'];
    $username = $_POST['username'];

    if ($comment != "" && $username != "") {
        //inserting data into database
        $query = "INSERT INTO `users` (`name`,`comments`) VALUES ('$username','$comment')";
        mysqli_query($link, $query);

        //selecting data from the database
        $query = "SELECT * FROM `users` WHERE `name`='$username'";
        if ($result = mysqli_query($link, $query)) {
            while ($row = mysqli_fetch_assoc($result)) {

                //sending response
                echo json_encode($row);
            }
        }
    }
}
