<?php

header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");


if($_SERVER['REQUEST_METHOD'] == "POST") {

$firstName = $_POST['fname'];
$lastName = $_POST['lname'];


    $output = "[";
    $output .= '{"firstName":"'.$firstName.'",';
    $output .= '"lastName":"'.$lastName.'"}';
    $output .= "]";
    echo $output;


/*
    $output = "[";
    $output .= '{"firstName":"'.$firstName.'"},';
    $output .= '{"lastName":"'.$lastName.'"}';
    $output .= "]";
    echo $output;*/

    //$output .= '{"Name": "Dishan"}';

//Json Response
/*    $output = "[";
    $output .= '{"firstName":   '.$firstName.'","';
    $output .= '"lastName":    '.$lastName.'"}"';
    $output .= "]";
    echo $output;*/

/* //working code
    $output = "[";
    $output .= '{"Name": "Dishan"}';
    $output .= "]";
    echo $output;
*/
}