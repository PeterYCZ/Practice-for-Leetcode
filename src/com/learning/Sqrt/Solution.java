package com.learning.Sqrt;

public class Solution {

    public int mySqrt(int x) {
        if(x == 1){
            return 1;
        }
        int result = 0;
        int y = 0;
        for(int i = 1;i <= 46340;i++){
            if((i*i) > x){
                System.out.println(i);
                result = i - 1;
                break;
            }
            y = i;
        }
        if (y== 46340){
            result = 46340;
        }

        return result;
    }

}
