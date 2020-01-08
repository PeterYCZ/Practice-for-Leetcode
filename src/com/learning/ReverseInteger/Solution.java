package com.learning.ReverseInteger;

public class Solution {

    public int reverse(int x) {
        try{
            if(x == 0){
                return x;
            }
            String z = "";
            int c = 1;
            if(x < 0){
                x = x*-1;
                c = -1;
            }
            while(x > 0){
                z += String.valueOf(x%10);
                x = x/10;
            }
            return Integer.valueOf(z)*c;
        }catch(Exception e){
            return 0;
        }
    }

}
