package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,0,9,5,4};
        boolean isArrayFront9 = arrayFront9(nums);
        System.out.println(isArrayFront9);
    }

    //return true if one of the first 4 elements in the nums is 9
    private static boolean arrayFront9(int[] nums) {
        int condition = nums.length;
        int arrayLength = nums.length;

        if(arrayLength >= 4) {
            condition = 4;
        }

        for(int i=0; i<condition; i++){
            if(nums[i] == 9){
                return true;
            }
        }
        return false;
    }
}
