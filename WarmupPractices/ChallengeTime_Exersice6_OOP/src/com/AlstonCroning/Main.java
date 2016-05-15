package com.AlstonCroning;

public class Main {
    public static void main(String[] args) {

        //Test Code
        int groupSize = 4;
        int[] myArray = {1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 7};


        LargestSumAndIndex largestSumAndIndex = new LargestSumAndIndex(0,0);
        largestSumAndIndex.findTheLargestSumOfConsecutiveEntries(myArray,groupSize);
    }
}
