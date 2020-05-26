package com.learning.TopKFrequentElements;

public class Main {

    public static void main(String[] args){
        SolutionBF solutionBF = new SolutionBF();
        int[] x = {1,2,3,3,3,4};
        int[] result = solutionBF.topKFrequent(x,1);
        for(int i = 0; i < result.length;i++){
            System.out.println(result[i]);
        }
    }

}
