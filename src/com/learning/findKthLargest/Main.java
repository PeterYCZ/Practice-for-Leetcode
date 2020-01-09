package com.learning.findKthLargest;


public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] T = {3,2,1,5,6,4};
        int result = solution.findKthLargest(T,2);
        System.out.print(result);
    }

}
