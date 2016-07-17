package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String str = "Hello";
        String result = left2(str);
        System.out.println(result);
    }

    // given a string return a 'rotated left 2' version
    // where the first 2 chars are moved to the end.
    private static String left2(String str) {
        int lengthStr = str.length();
        String frontStr = str.substring(0,2);
        String backStr = str.substring(2,lengthStr);

        if(lengthStr <= 2) {
            return str;
        } else {
            return backStr+frontStr;
        }
    }
}
