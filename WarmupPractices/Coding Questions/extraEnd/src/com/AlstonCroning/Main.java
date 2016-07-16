package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String str = "hisdasD";
        System.out.println(extraEnd(str));
    }

    private static String extraEnd(String str) {
        int length = str.length();
        if(length >= 2) {
            String result = str.substring(length-2,length);
            return result + result + result;
        }
        return null;
    }
}