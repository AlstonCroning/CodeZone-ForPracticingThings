package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        boolean result = endsLy("Dishanly");
        System.out.println(result);
    }

    //exercise endsLy
    //Given a string, return true if it ends in "ly".
    private static boolean endsLy(String str) {
        int length = str.length();
        if(length >= 2) {
            if (str.substring(length - 2, length).contains("ly")) {
                return true;
            }
        }
        return false;
    }
}
