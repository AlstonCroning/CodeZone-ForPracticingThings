package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {

        System.out.println(intMax(0,1,2));


    }



    private static int intMax(int a, int b, int c) {

        int max;

        if(a > b) {
            max = a;
        } else {
            max = b;
        }

        if(c > max) {
            max = c;
        }
        return max;

    }

}
