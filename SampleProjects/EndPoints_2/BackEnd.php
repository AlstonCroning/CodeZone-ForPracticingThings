<?php

header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");

$userName = $_POST['usernameFormName'];
$userComment = $_POST['commentFormName'];

if($_SERVER['REQUEST_METHOD'] == "POST") {
    echo "Name: " . $userName . " Comment: " . $userComment;
}
