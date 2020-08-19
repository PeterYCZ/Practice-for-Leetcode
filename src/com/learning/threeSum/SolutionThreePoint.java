package com.learning.threeSum;

import java.util.*;

public class SolutionThreePoint {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> results = new HashSet<>();
        Arrays.sort(nums);
        int last = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++) {
            if(last == nums[i]){
                continue;
            }else {
                last = nums[i];
            }
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[j] + nums[k];
                if(nums[i] + sum == 0){
                    results.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if (nums[i] + sum > 0){
                    k--;
                }else if (nums[i] + sum < 0){
                    j++;
                }
            }
        }
        return new ArrayList<>(results);
    }
}
