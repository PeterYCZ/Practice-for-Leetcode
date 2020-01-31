package com.learning.Subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        if(nums.length != 0){
            for(int i:nums){
                List<List<Integer>> newArrays = new ArrayList<>();
                for(List<Integer> set:result){
                    List<Integer> newSet = new ArrayList<>(set);
                    newSet.add(i);
                    newArrays.add(newSet);
                }
                for(List<Integer> set:newArrays){
                    result.add(set);
                }
            }
        }
        return result;
    }
}
