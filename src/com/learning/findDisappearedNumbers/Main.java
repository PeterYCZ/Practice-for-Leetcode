package com.learning.findDisappearedNumbers;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] T = {2,2,1,1,5,6,4};
        List<Integer> result = solution.findDisappearedNumbers(T);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
