package com.learning.CountingBits;

public class Main {

    public static void main(String[] args) {
        SolutionII solution = new SolutionII();
        int[] result = solution.countBits(5);
        for(int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
