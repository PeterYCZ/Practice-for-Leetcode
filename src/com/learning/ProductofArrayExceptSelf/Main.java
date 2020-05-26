package com.learning.ProductofArrayExceptSelf;

public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] x = {1,2,3,4};
        int[] result = solution.productExceptSelf(x);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

}
