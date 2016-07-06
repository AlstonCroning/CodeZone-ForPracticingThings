package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String str = "xx1x2x5xx";
        String result = stringX(str);
        System.out.println(result);
    }

//    given a string. return a version of string with all "x" removed.
//    except the first and last "x" of the string if any.
    private static String stringX(String str) {
        char strFirstChar;
        char strLastChar;
        String result;
        String subString = "";
        StringBuilder stringBuffer = new StringBuilder();
        int stringLength = str.length();

        if(stringLength <= 2){
            return str;
        } else {
            strFirstChar = str.charAt(0);
            strLastChar = str.charAt(stringLength-1);
            for (int i = 1; i < stringLength - 1; i++) {
                if (!str.substring(i, i + 1).contains("x")) {
                    subString += str.substring(i, i + 1);
                }
            }
            stringBuffer.append(strFirstChar);
            stringBuffer.append(subString);
            stringBuffer.append(strLastChar);
            result = stringBuffer.toString();
            return result;
        }
    }
}
