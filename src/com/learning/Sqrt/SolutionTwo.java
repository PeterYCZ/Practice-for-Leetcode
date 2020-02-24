package com.learning.Sqrt;

public class SolutionTwo {

    public int mySqrt(int x) {
        int start = 0;
        int end = 46340;
        int i = (end - start) / 2 ;
        while((end - start) > 1){
            if((x / i) == i){
                return i;
            }else if((x / i) < i){
                end = i;
                i = (i - start) / 2;
            }else{
                start = i;
                i = i + (end - i) / 2;
            }
        }
        if(x / start == start) {
            return start;
        }else{
            return end;
        }
    }

}
