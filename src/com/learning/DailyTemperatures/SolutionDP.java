package com.learning.DailyTemperatures;

public class SolutionDP {
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        for (int i=result.length-1; i>=0; i--) {
            int j = i+1;
            while(j < result.length) {
                if (T[j] > T[i]) {
                    result[i] = j-i;
                    break;
                } else if (result[j] == 0) {
                    break;
                } else {
                    j += result[j];
                }
            }
        }
        return result;
    }

}
