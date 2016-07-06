package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {1,9,2,3,4,5,9};
        int count = arrayCount9(intArray);
        System.out.println(count);
    }

    //count how many 9's in an nums
    private static int arrayCount9 (int[] intArray){
        int count = 0;
        for (int anIntArray : intArray) {
            if (anIntArray == 9) {
                count++;
            }
        }
        return count;
    }
}
