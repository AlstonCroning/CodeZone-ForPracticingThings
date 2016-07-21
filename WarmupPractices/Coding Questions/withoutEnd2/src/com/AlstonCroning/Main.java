package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String result = withoutEnd("Dishan");
        System.out.println(result);
    }

    //Given a string, return a version
    //without both the first and last char of the string.
    //The string may be any length, including 0.
    private static String withoutEnd(String str) {
        int length = str.length();
        if(length <= 2) {
            return "";
        }
        return str.substring(1,length-1);
    }
}