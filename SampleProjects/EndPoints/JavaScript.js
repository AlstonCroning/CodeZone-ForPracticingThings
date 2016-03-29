//sample Ajax Demonstration
var button = document.getElementById("btn");
button.addEventListener("click",loadDoc);

function loadDoc() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if(xhttp.readyState == 4 && xhttp.status == 200) {
            document.getElementById("message").innerHTML = xhttp.responseText;
        }
    };
    xhttp.open("POST","BackendPHP.php",true);
    xhttp.send();
}

