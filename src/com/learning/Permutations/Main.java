package com.learning.Permutations;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        SolutionSimple solution = new SolutionSimple();
        List<List<Integer>> results = solution.permute(nums);
        for(List<Integer> result : results){
            for(Integer x : result){
                System.out.print(x +" ");
            }
            System.out.println();
        }
    }

}

