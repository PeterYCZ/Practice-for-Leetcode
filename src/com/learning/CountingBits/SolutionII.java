package com.learning.CountingBits;

public class SolutionII {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        for(int i = 0;i<num+1;i++){
            result[i] = countBits(result,i);
        }
        return result;
    }

    public int countBits(int[] results,int num){
        if(num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }
        int result = results[num/2]+num%2;
        return result;
    }
}
