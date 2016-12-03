package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {

        //words array
        String[] words = {"one","one","two","three","three","two"};

        for(int i = 0; i < words.length-1; i++) {

            String currentData = words[i];
            String nextData = words[i+1];

            //compare current and next data
            if(currentData.equals(nextData)){
                words[i+1] = "";
            }

            //display result
            System.out.println(words[i]);

        }
    }
}
