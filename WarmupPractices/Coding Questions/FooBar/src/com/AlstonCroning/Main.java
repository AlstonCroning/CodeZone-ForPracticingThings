package com.AlstonCroning;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int remainder1, remainder2;

        for(int i=1;i<=100;i++){
            remainder1 = i % 3;
            remainder2 = i % 5;

            if( (remainder1 == 0) && (remainder2 == 0) ) {
                System.out.print(" FooBar ");
            } else if(remainder1 == 0) {
                System.out.print(" Foo ");
            } else if(remainder2 == 0){
                System.out.print(" Bar ");
            } else {
                System.out.print(i + " ");
            }
        }

    }
}
