package com.learning.CountingBits;

 /*
    Runtime: 16 ms, faster than 5.13% of Java online submissions for Counting Bits.
    Memory Usage: 45.8 MB, less than 5.88% of Java online submissions for Counting Bits.
 */

public class Solution {

    public int[] countBits(int num) {
        int[] results = new int[num+1];
        for(int i = 0;i<=num;i++){
            int j = i;
            int result = 0;
            while(j>0){
                result += j%2;
                j /= 2;
            }
            result += j/2;
            results[i] = result;
        }
        return results;
    }

}
