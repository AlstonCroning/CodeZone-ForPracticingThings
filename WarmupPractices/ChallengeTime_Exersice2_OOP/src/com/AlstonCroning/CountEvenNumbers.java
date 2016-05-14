package com.AlstonCroning;

public class CountEvenNumbers {
    private int remainder;
    private int count;

    //default constructor
    public CountEvenNumbers() {
        this.remainder = 0;
        this.count = 0;
    }

    public int countEvenNumbers(int number) {
        for(int i = 0; i <= number; i++) {
            this.remainder = i%2;//save remainder for comparison

            //if the remainder is 0 then the number is a even number
            if(remainder == 0) {
                this.count++;//represents the number of even numbers
            }
        }
        return count;
    }


    //getters
    public int getCount() {
        return count;
    }
}
