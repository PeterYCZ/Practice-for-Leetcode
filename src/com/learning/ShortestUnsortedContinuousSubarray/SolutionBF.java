package com.learning.ShortestUnsortedContinuousSubarray;

import java.util.Arrays;

public class SolutionBF {
    public int findUnsortedSubarray(int[] nums) {
        int[] order = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            order[i] = nums[i];
        }
        Arrays.sort(order);
        int start = 0;
        int end = 0;
        int isdifferent = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != order[i] && isdifferent == 0){
                start = i;
                isdifferent += 1;
            }else if(nums[i] != order[i]){
                end = i;
            }
        }
        /*
         try to get fast but failed
        for(int i = 0;i<nums.length;i++) {
            if (nums[i] != order[i]) {
                start = i;
                break;
            }
        }
        for(int i = nums.length - 1;i>0;i--){
            if (nums[i] != order[i]) {
                end = i;
                break;
            }
        }
         */

        if (end != start) {
            return end - start + 1;
        } else{
            return 0;
        }
    }

}
