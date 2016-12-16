package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDouble(2,2));
    }

    private static int sumDouble(int a, int b) {

        if(a != b) {
            return (a + b);
        }

        return 2*(a + b);
    }

}
