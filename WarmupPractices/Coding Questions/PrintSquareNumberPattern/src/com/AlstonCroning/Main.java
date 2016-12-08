package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {

        int userInput = 999;
        for(int i = 1; i <= userInput; i++) {

            for(int j = 1; j <= userInput; j++) {

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