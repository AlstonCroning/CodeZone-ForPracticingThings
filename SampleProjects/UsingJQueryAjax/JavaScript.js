// var username = document.getElementById("usernameID");
var button = document.getElementById("buttonID");
var msg = document.getElementById("messageID");

button.addEventListener("click",ClickFunction);


function ClickFunction () {
    // $("p[id='messageID']").css("color","green");

    $.ajax({
        url: "BackendPHP.php",
        type: "POST"
    });


}