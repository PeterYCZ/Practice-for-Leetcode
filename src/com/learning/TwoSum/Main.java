package com.learning.TwoSum;

public class Main {
    public static void main(String[] args) {
        try{
            int[] test = {2,3,4,5};
            int target = 6;
            //SolutionHash solution = new SolutionHash();
            SolutionBF solution = new SolutionBF();
            int[] result = solution.twoSum(test,target);
            for(int i:result){
                System.out.print(i+" ");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
