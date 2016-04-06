//sample Ajax Demonstration
var button = document.getElementById("btn");
var userName = document.getElementById("username");
var userComment = document.getElementById("inputComment");
var msgTextArea = document.getElementById("displayComment");

//event
button.addEventListener("click", loadDoc);

function loadDoc() {

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (xhttp.readyState == 4 && xhttp.status == 200) {
            var stringify = JSON.stringify(xhttp.responseText);
            var validResponse = JSON.parse(stringify);
            outputCommentsAsHTML(validResponse);
            //var strippedWhitespaces = stringify.replace(/ /g,'');
        }
    };
    xhttp.open("POST", "BackendPHP.php", true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send("username=" + userName.value + "&inputComment=" + userComment.value);

    // Send JSON
    //xhttp.setRequestHeader("Content-type", "application/json");
    //xhttp.send(
    //    JSON.stringify(
    //        {
    //            username: userName.value,
    //            inputComment: userComment.value
    //        }
    //    )
    //)
}

function outputCommentsAsHTML(arr) {
    var out = "";
    for (var i = 0; i < arr.length; i++) {
        out = arr[i];
        //msg.innerHTML += out;
        msgTextArea.innerHTML += out;
    }

}
