package com.learning.HappyNumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isHappy(int n) {
        Map<Integer,Boolean> sets = new HashMap<>();
        int j = n;
        boolean result = false;
        while(sets.get(j) == null){
            sets.put(j,true);
            j = 0;
            int temp = n;
            while(temp > 0){
                j += (temp%10)*(temp%10);
                temp /= 10;
            }
            n = j;
        }
        if(j == 1){
            result = true;
        }
        return result;
    }

}
