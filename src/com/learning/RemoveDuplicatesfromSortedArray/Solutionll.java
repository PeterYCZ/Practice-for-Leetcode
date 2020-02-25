package com.learning.RemoveDuplicatesfromSortedArray;

public class Solutionll {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length < 1){
            return length;
        }
        int i = 1;
        int j = 0;
        while(i < length){
            if(nums[j] == nums[i]){
                i++;
                if(i == length){
                    length = j + 1;
                }
            }else{
                if((i - j) > 1){
                    int k = j + 1;
                    while(k + i - j - 1 < length){
                        nums[k] = nums[k + i - j - 1];
                        k++;
                    }
                    length = length - i + j + 1;
                }
                j++;
                i = j + 1;
            }
        }
        return length;
    }
}
