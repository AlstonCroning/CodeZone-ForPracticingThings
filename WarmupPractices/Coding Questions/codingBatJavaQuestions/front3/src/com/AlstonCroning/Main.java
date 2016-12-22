package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        System.out.println(front3("sda"));
    }

    private static String front3(String str) {
        int strLength = str.length();
        String resultString;

        if(strLength < 3) {
            return str + str + str;
        } else {
            resultString = (str.substring(0,3));
            return resultString + resultString +resultString;
        }
    }
}
