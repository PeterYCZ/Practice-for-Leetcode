package com.learning.MedianofTwoSortedArrays;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] nums = new int[l1+l2];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < l1 && j < l2){
            if(nums1[i] < nums2[j]){
                nums[k] = nums1[i];
                k++;
                i++;
            }else{
                nums[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i < l1 ){
            nums[k] = nums1[i];
            k++;
            i++;
        }
        while(j < l2 ){
            nums[k] = nums2[j];
            k++;
            j++;
        }

        if((l1+l2)%2 == 0){
            return nums[nums.length/2 - 1] + nums[nums.length/2] / 2.0;
        }else{
            return nums[nums.length/2];
        }

    }

}
