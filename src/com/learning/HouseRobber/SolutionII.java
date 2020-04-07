package com.learning.HouseRobber;

public class SolutionII {
    public int rob(int[] nums) {
        int money = 0;
        if(nums.length > 1) {
            int oddodd = nums[0];
            int eveneven = nums[1];
            int oddeven = 0;
            int evenodd = 0;
            for(int i = 2;i<nums.length;i++){
                if(i%2 == 0){
                    evenodd = oddodd;
                    oddodd = oddeven > oddodd ? oddeven+nums[i]: oddodd+nums[i];
                }else{
                    oddeven = eveneven;
                    eveneven = eveneven > evenodd ? eveneven+nums[i]: evenodd+nums[i];
                }
            }
            return eveneven > oddodd?eveneven:oddodd;
        }else if(nums.length == 1){
            money = nums[0];
        }
        return money;
    }
}
