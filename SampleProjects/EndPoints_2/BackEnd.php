<?php

header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");

if(isset($POST["buttonFormName"])) {
    $userName = $_POST['usernameFormName'];
    $userComment = $_POST['commentFormName'];
    echo "Name: " . $userName . " Comment: " . $userComment;
}