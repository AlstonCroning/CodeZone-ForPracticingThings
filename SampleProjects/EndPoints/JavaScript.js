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
            //var stringyfy = JSON.stringify(xhttp.responseText);
            //msg.innerHTML = stringyfy;

            //var response = xhttp.responseText;
            //var validResponse = JSON.parse(response);
            //console.log(validResponse['error']);
            //myFunction(validResponse);
        }
    };
    xhttp.open("POST","BackendPHP.php",true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send("username="+userName.value+"&inputComment="+userComment.value);
}

function IsValidJSON(test) {
    try {
        var obj = JSON.parse(test);
        if (obj && typeof obj === "object" && obj !== null) {
            return true;
        }
    } catch (e) {
        msg.innerHTML += "Error";
    }
    return false;
}


function myFunction(arr) {
    var out = "";
    var _userName = "";
    var _userComment = "";
    for(var i=0; i < arr.length; i++) {
        _userName = arr[i].name;
        _userComment = arr[i].comments;
        msg.innerHTML += "<br/>User Name: " + _userName + "<br/>Comment: " + _userComment;
    }
}
