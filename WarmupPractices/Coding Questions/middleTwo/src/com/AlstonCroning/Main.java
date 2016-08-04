package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String result = middleTwo("dishan");
        System.out.println(result);
    }

    //Exercise: middleTwo
    //Given a string of even length,
    //return a string made of the middle two chars,
    //so the string "string" yields "ri".
    //The string length will be at least 2.
    private static String middleTwo(String str) {
        int length = str.length();
        int middle;

        //make sure if length is even
        if( (length%2) == 0 ){
            if(length <= 2) {
                return str;
            }
            middle = (length/2)-1;
            return str.substring(middle,middle+2);
        }
        return null;
    }
}
