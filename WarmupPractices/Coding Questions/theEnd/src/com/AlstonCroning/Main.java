package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String result = theEnd("dello",false);
        System.out.println(result);
    }

    //Given a string, return a string length 1 from its front,
    //unless front is false, in which case return a string length 1 from its back.
    //The string will be non-empty.
    private static String theEnd(String str, boolean front) {
        int length = str.length();
        if(length <= 1){
            return str;
        } else  {
            if(front){
                return str.substring(0,1);
            }
            return str.substring(length-1,length);
        }
    }
}