package com.learning.LargestRectangleinHistogram;

import com.learning.HappyNumber.Solution;

public class Main {
    public static void main(String[] args) {
        int[] test = {2,1,5,6,2,3};
        SolutionStack solution = new SolutionStack();
        System.out.println("stack: " +solution.largestRectangleArea(test));
        SolutionBF solutionbf = new SolutionBF();
        System.out.println("BF: " +solutionbf.largestRectangleArea(test));
    }
}
