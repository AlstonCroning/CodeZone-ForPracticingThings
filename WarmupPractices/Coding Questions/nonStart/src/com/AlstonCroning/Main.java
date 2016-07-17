package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String a = "hello";
        String b = "dishan";
        String result = nonStart(a,b);
        System.out.println(result);
    }

    // given 2 strings, return their concatenation, except omit the first char of each.
    // String will be at least length 1
    private static String nonStart(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        String result = "";

        if((lengthA > 0) && (lengthB > 0)) {
            result += a.substring(1,lengthA);
            result += b.substring(1,lengthB);
        }
        return result;
    }
}
