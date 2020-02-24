package com.learning.ClimbingStairs;

public class Solution {
    public int climbStairs(int n) {
        int[] result = new int[n+1];
        return getStairs(0,n,result);
    }

    public int getStairs(int start,int end, int[] result){
        if(start > end){
            return 0;
        }
        if(start == end) {
            return 1;
        }
        if(result[start] > 0){
            return result[start];
        }
        result[start] = getStairs(start+1,end,result)+getStairs(start+2,end,result);
        return result[start];
    }

}
