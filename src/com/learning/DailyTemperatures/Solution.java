package com.learning.DailyTemperatures;

public class Solution {

    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        for(int i = 0;i<T.length;i++){
            result[i] = 0;
            for(int j = i;j<T.length;j++){
                if(T[j] > T[i]){
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }

}
