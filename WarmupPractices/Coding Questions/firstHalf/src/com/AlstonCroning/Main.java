package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String str = "dishan";
        String result = firstHalf(str);
        System.out.println(result);
    }

    //given a string of even length, return the first half
    private static String firstHalf(String str) {
        int length = str.length();
        int halfLength;

        if((length%2) == 0){
            halfLength = length/2;
            return str.substring(0,halfLength);
        }
        return str;
    }
}