package com.learning.FindFirstandLastPositionofElementinSortedArray;

public class SolutionBF {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int isfind = -1;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == target && isfind == -1){
                result[0] = i;
                result[1] = i;
                isfind = 1;
            }else if(nums[i] == target && isfind == 1){
                result[1] = i;
            }
        }
        return result;
    }
}
