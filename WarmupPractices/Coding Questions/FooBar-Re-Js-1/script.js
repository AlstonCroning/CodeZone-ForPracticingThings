var msg = document.getElementById("msg");

for(var i = 1; i<= 100; i++) {
    var remainderX3 = i % 3;
    var remainderX5 = i % 5;

    if( (remainderX3 == 0) && (remainderX5 == 0) ){
        msg.innerHTML += "FooBar ";
    }
    else if(remainderX3 == 0) {
        msg.innerHTML += "Foo ";
    } else if(remainderX5 == 0) {
        msg.innerHTML += "Bar ";
    } else {
        msg.innerHTML += i + " ";
    }
}



