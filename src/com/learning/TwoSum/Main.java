package com.learning.TwoSum;

public class Main {
    public static void main(String[] args) {
        int[] test = {2,3,4,5};
        int target = 6;
        Solution solution = new Solution();
        int[] result = solution.twoSum(test,target);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
