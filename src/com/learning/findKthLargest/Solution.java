package com.learning.findKthLargest;

public class Solution {

    public int findKthLargest(int[] nums, int k) {

        int result = quickSort(nums,0,nums.length -1,k - 1 );
        return result;

    }

    public int quickSort(int[] arr,int low,int high,int k){
        int i,j,temp,t;
        if(low>high){
            return arr[low];
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp>=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp<=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        for(int x = 0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
        System.out.println();
        System.out.println(i + " " + k);
        if(i == k){
            return arr[i];
        }else if( i > k ){
            return quickSort(arr,low,i - 1,k);
        }else{
            return quickSort(arr,j+1,high,k);
        }
    }

}
