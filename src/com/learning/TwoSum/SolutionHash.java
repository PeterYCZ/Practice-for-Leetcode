package com.learning.TwoSum;

import java.util.HashMap;
import java.util.Map;

//use HashMap to solve this problem
public class SolutionHash {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i = 0;i<nums.length;i++){
            int value = target - nums[i];
            if(map.get(value) != null && map.get(value) != i){
                result[0] = i;
                result[1] = map.get(value);
                return result;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
