package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,0,8,1,5,6};
        boolean isNoTriple = noTriples(nums);
        System.out.println(isNoTriple);
    }

    //return true if the array has no thriples in a row
    private static boolean noTriples(int[] nums) {
        int currentData;
        int secondData;
        int thirdData;

        for(int i=0;i<nums.length-2;i++) {
            currentData = nums[i];
            secondData = nums[i+1];
            thirdData = nums[i+2];
            if( !((i >= nums.length-2) && (nums.length <= 2)) ) {
                if (((currentData == secondData) && (currentData == thirdData))) {
                    return false;
                }
            }
        }
        return true;
    }
}
