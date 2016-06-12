package com.AlstonCroning;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String [] array = {"one","one","two","three","four","four","five","six","one"};

        for(int i = 0; i < array.length; i++) {

            for(int k = (i+1); k < array.length; k++) {
                if(array[i].equals(array[k])){
                    array[k] = "";
                }
            }
            if(!array[i].isEmpty()) {
                System.out.println(array[i]);
            }
        }

    }
}
