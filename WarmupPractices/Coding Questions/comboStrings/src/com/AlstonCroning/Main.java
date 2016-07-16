package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        String result = comboString("di","dis");
        System.out.println(result);
    }

    //given 2 strings a and b. return a string of short+long+short
    private static String comboString(String a,String b) {
        int lengthA = a.length();
        int lengthB = b.length();

        //checking whether a is bigger
        if(lengthA >= lengthB){
            return (b+a+b);
        } else {
            return (a+b+a);
        }
    }
}
