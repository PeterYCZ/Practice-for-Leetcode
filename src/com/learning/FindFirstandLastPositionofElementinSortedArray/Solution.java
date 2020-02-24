package com.learning.FindFirstandLastPositionofElementinSortedArray;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        if(nums.length < 1){
            return result;
        }
        int end = nums.length - 1;
        int start = 0;
        int i = end / 2;
        int location = -1;
        while(start <= end){
            if(target < nums[i]){
                end = i - 1;
                i = i / 2;
            }else if(target > nums[i]){
                start = i + 1;
                i = start + (end-start) / 2;
            }else{
                location = i;
                result[0] = location;
                result[1] = location;
                break;
            }
        }
        if(location != -1){
            i = location;
            int j = location;
            while(i>-1){
                if(nums[i] == target){
                    i--;
                }else{
                    break;
                }
            }
            while(j<nums.length){
                if(nums[j] == target){
                    j++;
                }else{
                    break;
                }
            }
            result[0] = i+1;
            result[1] = j-1;
        }
        return result;
    }
}
