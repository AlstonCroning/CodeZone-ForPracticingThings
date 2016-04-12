var msg = document.getElementById("message");
var userName = document.getElementById("usernameFormId");
var comment = document.getElementById("commentFormId");
var button = document.getElementById("buttonFormId");

button.addEventListener("click", loadDoc);

function loadDoc() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (xhttp.readyState == 4 && xhttp.status == 200) {
           msg.innerHTML += xhttp.responseText;
//             var stringify = JSON.stringify(xhttp.responseText);
//             var validResponse = JSON.parse(stringify);
//             outputCommentsAsHTML(validResponse);
        }
    };
    xhttp.open("POST", "BackEnd.php", true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send("usernameFormName=" + userName.value + "&commentFormName=" + comment.value);
    /*

        xhttp.setRequestHeader("Content-type", "application/json; charset=UTF-8");
        xhttp.send(
           JSON.stringify(
               {
                   usernameForm: userName.value,
                   commentForm: comment.value
               }
           )
        );
    */
    // xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    // xhttp.send("usernameForm=" + userName.value + "&commentForm=" + comment.value);
}


function outputCommentsAsHTML(arr) {
    var out = "";
    for (var i = 0; i < arr.length; i++) {
        out = arr[i];
        msg.innerHTML += out;
    }
}

