package com.learning.PascalTriangle;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> results = solution.generate(10);
        for(List<Integer> result:results){
            for(Integer x:result){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }

}
