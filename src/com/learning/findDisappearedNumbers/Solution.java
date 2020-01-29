package com.learning.findDisappearedNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        int i = 1;
        int j = 0;
        int max = nums.length;
        while(i <= max){
            if(i == nums[j]) {
                while (i == nums[j]) {
                    if(j == (nums.length -1)){
                        break;
                    }else {
                        j++;
                    }
                }
                i++;
            }else{
                result.add(i);
                i++;
            }
        }
        return result;
    }

}
