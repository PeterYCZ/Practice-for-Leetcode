package com.learning.ProductofArrayExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1;
        int count_zero = 0;
        for(int i : nums){
            if(i != 0) {
                sum = sum * i;
            }else {
                count_zero += 1;
            }
        }
        int[] result = new int[nums.length];
        if(count_zero > 1) {
            return result;
        }else if(count_zero == 1) {
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == 0){
                    result[i] = sum;
                }else {
                    result[i] = 0;
                }
            }
        }else {
            for (int i = 0; i < nums.length; i++) {
                result[i] = sum / nums[i];
            }
        }
        return result;
    }
}
