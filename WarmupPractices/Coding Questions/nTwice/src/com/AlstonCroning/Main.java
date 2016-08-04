package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String result = nTwice("dishan",6);
        System.out.println(result);
    }

    //Given a string and an int n,
    //return a string made of the first and last n chars from the string.
    //The string length will be at least n.
    private static String nTwice(String str, int n) {
        int length = str.length();
        String front;
        String back;
    if((length >= 2 && (n <= length-1)) || (length == n) ) {
            front = str.substring(0,n);
            back = str.substring(length-n,length);
            return front+back;
        }
        return str;
    }
}
