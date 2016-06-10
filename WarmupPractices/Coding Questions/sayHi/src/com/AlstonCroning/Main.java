package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        System.out.println(startHi("hi "));
    }

    private static boolean startHi(String str) {
        return !(str.isEmpty() || str.length() <= 1) && (str.substring(0, 2).equals("hi"));
    }
}
