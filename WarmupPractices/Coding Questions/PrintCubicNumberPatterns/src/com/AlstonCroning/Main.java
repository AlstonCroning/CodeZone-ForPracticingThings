package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        int modLength = 999;

        for(int i = 1; i <= modLength; i++) {
            for(int k = 1; k <= modLength; k++) {

                if(i>=100 && i< 1000){
                    System.out.print(i + "  ");
                }
                else if(i>=10 && i<100){
                    System.out.print(i + "   ");
                } else {
                    System.out.print(i + "    ");
                }
            }
            System.out.println();
        }

    }
}
