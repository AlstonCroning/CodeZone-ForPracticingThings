console.log(findEvenNumber(8));

function findEvenNumber(number) {

    var count = 0;

    for(var i = 0; i <= number; i++) {

        if ((i % 2) == 0) {
            count++;
        }
    }
    return count;
}