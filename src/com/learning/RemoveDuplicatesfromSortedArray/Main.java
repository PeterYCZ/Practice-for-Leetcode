package com.learning.RemoveDuplicatesfromSortedArray;

public class Main {
    public static void main(String[] args) {
        Solutionll solution = new Solutionll();
        int[] test = {0,0,1,1,1,2,2,3,3,4,4,4};
        int result = solution.removeDuplicates(test);
        for(int i = 0;i<result;i++){
            System.out.println(test[i]);
        }
    }
}
