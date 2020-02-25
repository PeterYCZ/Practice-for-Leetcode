package com.learning.Permutations;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution solution = new Solution();
        List<List<Integer>> results = solution.permute(nums);
        for(List<Integer> result : results){
            for(Integer x : result){
                System.out.print(x +" ");
            }
            System.out.println();
        }
    }

}

