package com.AlstonCroning;

public class NumbersAndFooBar {
    //private fields
    private int number1;
    private int number2;
    private int Remainder_num1;
    private int Remainder_num2;

    //default constructor
    public NumbersAndFooBar() {
        this.number1 = 3;
        this.number2 = 5;
        this.Remainder_num1 = 0;
        this.Remainder_num2 = 0;
    }

    //method for printing NumbersAndFooBar
    public void printNumbersAndFooBar () {
        for (int i = 1; i <= 100; i++) {
            //save the remainder of each number
            this.Remainder_num1 = i%this.number1;
            this.Remainder_num2 = i%this.number2;

            if(Remainder_num1 == 0 || Remainder_num2 == 0) {
                //prints FooBar
                if(Remainder_num1 == 0 && Remainder_num2 == 0) {
                    System.out.print("FooBar ");
                }
                //prints 'Foo' or 'Bar'
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
