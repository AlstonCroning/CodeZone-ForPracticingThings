package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        //Exercise 4
        String[] myArray = {"one","one","two","three","three","two"};

        RemoveDuplicatesFromStringArray stringArray_1 = new RemoveDuplicatesFromStringArray(myArray);
        stringArray_1.removeDuplicatesFromArrays();
        stringArray_1.displayArray();//display array after removing duplicates
    }
}
