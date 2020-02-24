package com.learning.RemoveElement;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int length = nums.length;
        int result = 0;
        while(i<length){
            if(nums[i] != val){
                result++;
                i++;
            }else{
                int j = i;
                while(j<length-1){
                    nums[j] = nums[j+1];
                    j++;
                }
                length--;
            }
        }
        return result;
    }

}
