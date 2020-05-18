package com.learning.ShortestUnsortedContinuousSubarray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] nums = {12,3,4};
        SolutionBF solution = new SolutionBF();
        System.out.println(solution.findUnsortedSubarray(nums));
    }

}
