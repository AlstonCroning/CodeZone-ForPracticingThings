package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {

        String returnedString = frontTimes("Alston",3);
        System.out.println(returnedString);
    }

    private static String frontTimes(String str,int n) {
        String chars;
        String madeString = "";

        if(str.isEmpty()){
            return madeString;
        } else if(str.length() < 3) {
            chars = str.substring(0,str.length());
            for(int i=0;i<n;i++) {
                madeString += chars;
            }
            return madeString;
        } else {
            chars = str.substring(0,3);
            for(int i=0;i<n;i++) {
                madeString += chars;
            }
            return madeString;
        }
    }
}
