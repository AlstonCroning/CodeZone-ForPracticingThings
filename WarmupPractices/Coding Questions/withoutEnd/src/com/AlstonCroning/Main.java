package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String result = withoutEnd("Dishan");
        System.out.println(result);
    }

    //given a string, return a version without the first and last char
    //string lenght will be at least 2
    private static String withoutEnd(String str) {
        int length = str.length();
        if(length < 2) {
            return str;
        } else if(length >= 2) {
            return str.substring(1,length-1);
        }
        return null;
    }
}
