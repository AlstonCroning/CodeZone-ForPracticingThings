package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true,true));

    }

    private static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        return aSmile && bSmile || !aSmile && !bSmile;
    }

}