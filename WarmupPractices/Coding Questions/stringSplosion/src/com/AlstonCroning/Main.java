package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String str = "code";
        String result = stringSplosion(str);
        System.out.println(result);
    }

    //given a string like 'code' return a string like 'ccocodcode'
    private static String stringSplosion(String str) {
        int count = 1;
        boolean isTrue = true;
        String result = "";

        while(isTrue) {
            isTrue = false;
            if(count <= str.length()){
                result += str.substring(0,count);
                isTrue = true;
            }
            count++;
        }
        return result;
    }
}
