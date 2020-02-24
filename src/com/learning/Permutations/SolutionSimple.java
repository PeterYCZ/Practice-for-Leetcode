package com.learning.Permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionSimple {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int n = getN(length);
        for(int i = 0;i<n;i++){
            List<Integer> list1 = new ArrayList<Integer>();
            //将原数组加入集合中
            if(i == 0){
                List<Integer> list2 = new ArrayList<Integer>();
                for(int j:nums){
                    list2.add(j);
                }
                list.add(list2);
            }

            nums = findNearestNumber(nums);
            if(nums == null) break;
            //将数组元素加入集合中
            for(int j:nums){
                list1.add(j);
            }
            list.add(list1);
        }
        return list;
    }
    //获取总共的排列组合数
    public static int getN(int length){
        if(length == 1){
            return length;
        }
        return length*getN(length-1);
    }
    //排列
    public static int[] findNearestNumber(int[] arr){
        int index = returnIndex(arr);
        if(index == 0) return null;
        for(int i = arr.length-1;i>=index;i--){
            if(arr[index-1]<arr[i]){
                int tmp = arr[index-1];
                arr[index-1] = arr[i];
                arr[i] = tmp;
                break;
            }
        }
        reverseArr(arr,index,arr.length-1);
        return arr;

    }

    //逆序
    public static void reverseArr(int[] arr,int start,int end){
        while(start<=end){
            int tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }
    }
    //从后向前遍历找出arr[i]<arr[i-1]的下标i
    public static int returnIndex(int[] arr){
        for (int i = arr.length-1; i >0 ; i--) {
            if(arr[i]>arr[i-1]){
                return i;
            }
        }
        return 0;
    }

}
