package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        printNumbersOrFooBar();//function call
    }

    //function
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
}
