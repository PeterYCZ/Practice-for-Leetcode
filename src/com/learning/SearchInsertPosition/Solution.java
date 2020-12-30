package com.learning.SearchInsertPosition;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        if(nums == null) {
            return 0;
        }
        int last = nums[0];
        if(target < last) {
            return 0;
        }
        for(int i = 1;i<nums.length;i++) {
            if(target > last && target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

}
