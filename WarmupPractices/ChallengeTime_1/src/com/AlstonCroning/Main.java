package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        //exercise 1
        //printNumbersOrFooBar();

        //exercise 2
        //countEvenNumbers(15);

        //exercise 4
        //removeDuplicatesFromArrays();

        //exercise 5
        //printLikeNumbers();

        //exercise 6
        int[] myArray = new int[8];
        myArray[0] = 1;
        myArray[1] = 1;
        myArray[2] = 1;
        myArray[3] = 1;
        myArray[4] = 1;
        myArray[5] = 1;
        myArray[6] = 1;
        myArray[7] = 1;

        findLargestSum(myArray,2);
    }

    //exercise 1
    public static void printNumbersOrFooBar () {

        //variables
        int number1 = 3;
        int number2 = 5;
        int Remainder_num1 = 0;
        int Remainder_num2 = 0;

        //Loop from( 1 to 100)
        for (int i = 1; i <= 100; i++) {

            //save the remainder of each number
            Remainder_num1 = i%number1;
            Remainder_num2 = i%number2;

            //if either one of the remainders are '0' this condition is true
            if(Remainder_num1 == 0 || Remainder_num2 == 0) {

                //print 'FooBar' if both remainders are the '0'
                if(Remainder_num1 == 0 && Remainder_num2 == 0) {
                    System.out.print("FooBar ");
                }
                //print 'Foo' or 'Bar'
                else {
                    if (Remainder_num1 == 0) {
                        System.out.print("Foo ");
                    }
                    if (Remainder_num2 == 0) {
                        System.out.print("Bar ");
                    }
                }
            }
            //print numbers that aren't multiplication of '3' or '5'
            else {
                System.out.print(i + " ");
            }
        }
    }

    //exercise 2
    public static void countEvenNumbers(int number) {

        int remainder = 0;
        int count = 0;

        for(int i = 0; i <= number; i++) {
            remainder = i%2;
            if(remainder == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    //exercise 4
    public static void removeDuplicatesFromArrays() {
        String[] myarray = new String[6];
        myarray[0] = "one";
        myarray[1] = "one";
        myarray[2] = "two";
        myarray[3] = "three";
        myarray[4] = "three";
        myarray[5] = "two";
        String tempWord = "";

        //loop throughly and compare each word and remove duplicates
        for(int i = 0; i < 6; i++) {
            tempWord = myarray[i];//save each word

            for(int k = (i+1); k < 6; k++) {
               if( tempWord.equals(myarray[k])) {
                   myarray[k] = "";
               }
            }
        }

        //print the remaining values of array to the output
        int count = 0;
        while (count < 6) {
            System.out.print(myarray[count] + " ");
            count++;
        }

    }

    //exercise 5
    public static void printLikeNumbers() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i + " " + i + " " + i + " " + i + " " + i);
        }
    }

    //exercise 6
    public static int findLargestSum(int[] array, int groupSize) {

        int count = 0;
        int itteration = 0;

        for(int i = 0; i < array.length; i++) {
             itteration = array[i];
            if (itteration == array[itteration+1]) {
                count++;
            }
        }
        System.out.println(count);

        return 0;
    }
}
