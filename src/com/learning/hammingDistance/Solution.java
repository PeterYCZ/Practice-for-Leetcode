package com.learning.hammingDistance;

public class Solution {

    public int hammingDistance(int x, int y) {
        int value = x ^ y;
        int result = 0;
        String v = Integer.toBinaryString(value);
        for(int i = 0;i<v.length();i++){
            if(v.substring(i,i+1).equals("1")){
                result += 1;
            }
        }
        return result;
    }

}
