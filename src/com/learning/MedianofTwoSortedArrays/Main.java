package com.learning.MedianofTwoSortedArrays;


public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};
        Solution solution = new Solution();
        double result = solution.findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }


}
