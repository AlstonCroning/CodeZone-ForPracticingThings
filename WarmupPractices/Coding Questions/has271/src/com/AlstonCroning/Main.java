package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,7,1};
        boolean is271 = has271(nums);
        System.out.println(is271);
    }

    //return true if the array contains 2,7,1 pattern
    //a value, followed by the value plus 5, followed by the value minus 1
    //Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
    private static boolean has271(int[] nums) {
        int length = nums.length;
        int currentData;
        int secondData;
        int thirdData;
        int correctValue;

        for(int i=0; i<length-2; i++) {
            currentData = nums[i];
            secondData = nums[i+1];
            thirdData = nums[i+2];
            correctValue = currentData-1;

                if( ((secondData == (currentData+5))
                        && ( (thirdData >= (correctValue-2))
                        && (thirdData <= (correctValue+2)) )) ){
                    return true;
                }
        }
        return false;
    }
}
