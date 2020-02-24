package com.learning.hammingDistance;

public class SolutionBitwiseOperations {

    public int hammingDistance(int x, int y) {
        int result = 0;
        for(int i = 31;i>-1;i--){
            int bitX = x & (1<<i);
            int bitY = y & (1<<i);
            if(bitX != bitY){
                result += 1;
            }
        }
        return result;
    }

}
