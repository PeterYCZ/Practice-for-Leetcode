package com.learning.HouseRobber;

/* Time Limit Exceeded */
public class Solution {
    public int rob(int[] nums) {
        int money = maxMoney(nums,0,0) > maxMoney(nums,1,0)?maxMoney(nums,0,0):maxMoney(nums,1,0);
        return money;
    }

    public int maxMoney(int[] nums,int start, int sum){
        if(start < nums.length){
            sum += nums[start];
            return maxMoney(nums,start + 2,sum) > maxMoney(nums,start +3,sum)?maxMoney(nums,start + 2,sum):maxMoney(nums,start + 3,sum);
        }
        return sum;
    };
}
