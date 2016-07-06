package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        int[] nums = {4,1,2,3,5,6};
        boolean is123Present = array123(nums);
        System.out.println(is123Present);
    }

    //if 1,2,3 in order in an nums somewhere then return true
    private static boolean array123(int[] nums) {
        int count = 1;
        for (int num : nums) {
            if (num == count) {
                if (count == 3) {
                    return true;
                }
                count++;
            }
        }
        return false;
    }
}
