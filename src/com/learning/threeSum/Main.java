package com.learning.threeSum;

import java.util.List;

public class Main {

    public static void main(String[] args){
        SolutionThreePoint solution = new SolutionThreePoint();
        int[] x = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> results = solution.threeSum(x);
        System.out.println(results);
    }

}

