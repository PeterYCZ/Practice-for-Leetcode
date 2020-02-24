package com.learning.RemoveDuplicatesfromSortedArrayII;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> x = new HashMap<>();
        for(int i:nums){
            if(x.get(i) == null){
                x.put(i,1);
            }else{
                x.put(i,x.get(i)+1);
            }
        }
        int result = 0;
        for(int i:x.keySet()){
            if(x.get(i) > 2){
                result += 2;
            }else{
                result += x.get(i);
            }
        }
        nums = new int[result];
        int j = 0;
        for(int i:x.keySet()){
            if(x.get(i) >= 2){
                nums[j] = i;
                nums[j+1] = i;
                j += 2;
            }else{
                nums[j] = i;
                j += 1;
            }
        }
        return result;
    }
}
