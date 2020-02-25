package com.learning.Permutations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        Map<Integer,Boolean> usedNum = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        getList(usedNum,nums,result);
        return results;
    }

    public void getList(Map<Integer,Boolean> usedNum,int[] nums,List<Integer> result){
        if(result.size() == nums.length){
            results.add(result);
        }
        for(int i = 0;i<nums.length;i++){
            if(usedNum.get(nums[i]) == null){
                usedNum.put(nums[i],true);
                result.add(nums[i]);
                getList(usedNum,nums,result);
            }else if(usedNum.get(nums[i]) == false){
                usedNum.put(nums[i],true);
                result.add(nums[i]);
                getList(usedNum,nums,result);
            }else if(usedNum.get(nums[i]) == true){
                continue;
            }
        }

    }

}
