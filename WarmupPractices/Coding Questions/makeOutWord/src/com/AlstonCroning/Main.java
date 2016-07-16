package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String out = "<<>>";
        String word = "Dishan";
        String result = makeOutWord(out,word);
        System.out.println(result);
    }

    private static String makeOutWord(String out,String word) {
        String frontTag = out.substring(0,2);
        String endTag = out.substring(2,4);
        return frontTag + word + endTag;
    }
}
