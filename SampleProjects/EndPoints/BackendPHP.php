<?php

header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");

$link = mysqli_connect("localhost","root","a1xcr0nge","sampledatabase");
if(mysqli_connect_error()) {
//    echo "Couldn't connect to Database";
    die("Couldn't connect to DataBase");
}

if($_SERVER['REQUEST_METHOD'] == "POST") {

    $comment = $_POST['inputComment1'];
    $username = $_POST['username'];

    if ($comment != "" && $username != "") {
        $query = "INSERT INTO `users` (`name`,`comments`) VALUES ('$username','$comment')";
        mysqli_query($link, $query);


        $query = "SELECT * FROM `users` WHERE `name`='$username'";

        if ($result = mysqli_query($link, $query)) {
            while ($rows = mysqli_fetch_array($result)) {
                print_r($rows);
            }
        }

        //print $comment;
    }
}