var output = document.getElementById("output");
var button = document.getElementById("btn");

var firstName = document.getElementById("fname");
var lastName = document.getElementById("lname");

button.addEventListener("click",loadDoc);

function loadDoc() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if(xhttp.readyState == 4 && xhttp.status == 200) {
            //output.innerHTML = xhttp.responseText;
            //xhttp.responseText;
            //myFunction(xhttp.responseText);

            var arr = JSON.parse(xhttp.responseText);
            myFunction(arr);


        }
    };
    xhttp.open("POST","backend.php",true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send("fname="+firstName.value+"&lname="+lastName.value);
}

function myFunction(response) {
    var out = "";
    var _firstName = "";
    var _lastName = "";
    for(i=0; i < response.length; i++) {
        _firstName += response[i].firstName;
        _lastName += response[i].lastName;
        //out += "First Name: " + response[i].firstName;
    }
    output.innerHTML = "First Name: " + _firstName + "<br/>Last Name: " + _lastName;
}