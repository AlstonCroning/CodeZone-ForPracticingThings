package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        int[] nums = {6,1,2,3,6,7};
        int count = array667(nums);
        System.out.println(count);
    }

    //return number of times '6' next to another (6 or 7)
    private static int array667(int[] nums) {
        int currentData;
        int nextData;
        int count = 0;

        for(int i=0;i<nums.length-1;i++){
            currentData = nums[i];
            nextData = nums[i+1];

            if( !((i == nums.length) && (nums.length <= 1)) ) {
                if( (currentData == 6) && ((nextData == 6) || (nextData == 7)) ){
                    count++;
                }
            }
        }
        return count;
    }
}
