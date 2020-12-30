package com.learning.SearchInsertPosition;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[3];
        nums[0] = 0;
        nums[1] = 3;
        nums[2] = 4;
        int result = solution.searchInsert(nums,-1);
        System.out.println(result);
    }

}
