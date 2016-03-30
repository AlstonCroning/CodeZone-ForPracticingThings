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

    var dataToSend = {"firstName": firstName.value, "lastName": lastName.value};
    var dataAsString = JSON.stringify(dataToSend);
    xhttp.open("POST","backend.php",true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send("fname="+firstName.value+"&lname="+lastName.value);
}

function myFunction(arr) {
    var out = "";
    var _firstName = "";
    var _lastName = "";
    for(var i=0; i < arr.length; i++) {
        _firstName = arr[i].firstName;
        _lastName = arr[i].lastName;
        output.innerHTML += "<br/>First Name: " + _firstName + "<br/>Last Name: " + _lastName;
    }
    //arr.forEach(element => {
    //    output.innerHTML += "<br/>First Name: " + element.firstName + "<br/>Last Name: " + element.lastName;
    //});

    //arr.forEach(function (element) {
    //    output.innerHTML += "<br/>First Name: " + element.firstName + "<br/>Last Name: " + element.lastName;
    //})
}