// var username = document.getElementById("usernameID");
// var button = document.getElementById("buttonID");
// var msg = document.getElementById("messageID");
//
// button.addEventListener("click",ClickFunction);
//
//
// function ClickFunction () {
// }

/* //load method
$(document).ready(function () {
    $("div").load("loadData.html #div1",function (response,status){
        alert(response);
        alert(status);
    });
});
*/

/*
//get method
$("button").click(function () {
    $.get("loadData.html",function (response,status) {
       alert("data: \n"+response+" \nstatus: "+status);
    });
});
*/

//post method
$("button").click(function () {
    $.post("BackendPHP.php",function (response,status) {
        alert("data: \n"+response+" \nstatus: "+status);
    });
});

