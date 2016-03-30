//sample Ajax Demonstration
var button = document.getElementById("btn");
var userName = document.getElementById("username");
var userComment = document.getElementById("inputComment");
var msg = document.getElementById("message");

//event
button.addEventListener("click",loadDoc);

function loadDoc() {

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if(xhttp.readyState == 4 && xhttp.status == 200) {
            msg.innerHTML = xhttp.responseText;
        }
    };
    xhttp.open("POST","BackendPHP.php",true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send("username="+userName.value+"&inputComment="+userComment.value);
}

