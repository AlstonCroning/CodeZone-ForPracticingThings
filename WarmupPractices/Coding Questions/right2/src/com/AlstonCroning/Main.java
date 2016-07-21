package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String result = right2("Hello");
        System.out.println(result);
    }

    //return a 'rotated right 2' version where the
    // last 2 chars are moved to the start.
    // The string length will be at least 2
    private static String right2(String str) {
        int length = str.length();
        String rightStr;
        String frontStr;

        if(length <= 2) {
            return str;
        }
        rightStr = str.substring(length-2,length);
        frontStr = str.substring(0,length-2);
        return rightStr+frontStr;
    }
}