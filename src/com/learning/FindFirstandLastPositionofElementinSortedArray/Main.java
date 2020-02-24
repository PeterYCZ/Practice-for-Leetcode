package com.learning.FindFirstandLastPositionofElementinSortedArray;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] test = {2,2};
        int[] result = solution.searchRange(test,3);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
