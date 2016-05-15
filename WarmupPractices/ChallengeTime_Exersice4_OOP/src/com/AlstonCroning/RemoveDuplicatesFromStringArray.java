package com.AlstonCroning;

public class RemoveDuplicatesFromStringArray {
    private String[] myArray;
    private String tempWord;//used to store current data off array
    private int count;//used for while loop
    private int arrayLength;

    //default constructor
    public RemoveDuplicatesFromStringArray(String[] myArray) {
        this.myArray = myArray;
        this.arrayLength = myArray.length;
        this.tempWord = "";
        this.count = 0;
    }

    //method for removing dulplicates
    public void removeDuplicatesFromArrays() {
        for (int i = 0; i < myArray.length; i++) {
            tempWord = myArray[i];//save each word
            for (int k = (i + 1); k < myArray.length; k++) {
                //if the current word is equals with next word then replace with empty string
                if (tempWord.equals(myArray[k])) {
                    myArray[k] = "";
                }
            }
        }
    }

    //display the array before/after removing duplicates
    public void displayArray() {
        while (count < arrayLength) {
            System.out.print(myArray[count] + " ");
            count++;
        }
        System.out.println();
        count = 0;
    }
}
