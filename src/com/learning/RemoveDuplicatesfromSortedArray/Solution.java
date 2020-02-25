package com.learning.RemoveDuplicatesfromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length < 1){
            return length;
        }
        int i = 1;
        int result = 1;
        int target = nums[0];
        while(i < length){
            if(target != nums[i]){
                target = nums[i];
                i++;
                result++;
            }else{
                int j = i;
                while(j < length){
                    nums[j] = nums[j+1];
                    j++;
                }
                length--;
            }
        }
        return result;
    }
}
