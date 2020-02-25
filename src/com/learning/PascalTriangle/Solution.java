package com.learning.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();
        int[] last = null;
        int[] temp = null;
        for(int i = 0; i < numRows;i++){
            List<Integer> result = new ArrayList<>();
            if(last == null){
                result.add(1);
                results.add(result);
                last = new int[]{1};
            }else{
                temp = new int[i+1];
                temp[0] = 1;
                temp[i] = 1;
                result.add(1);
                for(int j = 1;j<i;j++){
                    temp[j] = last[j-1]+last[j];
                    result.add(temp[j]);
                }
                result.add(1);
                results.add(result);
                last = temp;
            }
        }
        return results;
    }

}
