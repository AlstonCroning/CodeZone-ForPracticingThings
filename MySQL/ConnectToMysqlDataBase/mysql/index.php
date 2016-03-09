<?php

$link = mysqli_connect("localhost","root","a1xcr0nge","sampledatabase");

if(mysqli_connect_error()) {
//    echo "Couldn't connect to Database";
    die("Couldn't connect to DataBase");
}


//selecting data
//$query = "SELECT * FROM users WHERE email LIKE '%h%'";
//$query = "SELECT * FROM users WHERE name LIKE '%b'";
//$query = "SELECT * FROM users WHERE email LIKE 'b%'";
//$query = "SELECT * FROM users WHERE id < 9 AND name LIKE '%b%'";


/*
//first method
$query = "UPDATE `users` SET `name`='Ian 0\ 'Neil' WHERE `id`=3 LIMIT 1";
mysqli_query($link,$query);
*/

//second method
$name = "Ian 0'Neil";
$query = "SELECT `name` FROM `users`
WHERE `name`='".mysqli_real_escape_string($link,$name)."'";



//displaying the database data
if($result = mysqli_query($link,$query)) {

    echo "number of rows ".mysqli_num_rows($result)."<br />";

    while($row = mysqli_fetch_array($result)) {
        print_r($row);
    }
}
else {
    echo "It failed!";
}

/*
//updating an existing data
$query = "UPDATE `users` SET `name`='Bethany' WHERE `name`= 'bethany'";
mysqli_query($link,$query);
*/


/*
//updating an existing data
$query = "UPDATE `users` SET `email`='beth@hotmail.com' WHERE `id`= 8 LIMIT 1";
mysqli_query($link,$query);
*/


/*
//inserting data
$query = "INSERT INTO `users` (`name`,`email`) VALUES ('Beth','beth@email.com')";
mysqli_query($link,$query);
*/


/*
//selecting data
$query = "SELECT * FROM users";
if($result = mysqli_query($link,$query)) {
    $row = mysqli_fetch_array($result);
    print_r($row);
} else {
    echo "It failed!";
}*/

