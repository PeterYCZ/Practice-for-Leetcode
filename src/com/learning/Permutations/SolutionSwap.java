package com.learning.Permutations;

import java.util.ArrayList;
import java.util.List;

public class SolutionSwap {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        return recursive(nums,ans,0);
    }
    public List<List<Integer>> recursive(int[] nums,List<List<Integer>> ans,int start){
        if(start==nums.length-1){
            List<Integer> subans=new ArrayList<>();
            for(int num:nums){
                subans.add(num);
            }
            ans.add(subans);
        }else{
            for(int i=start;i<nums.length;i++){
                swap(start,i,nums);
                recursive(nums,ans,start+1);
                swap(start,i,nums);
            }
        }
        return ans;
    }
    public void swap(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }


}
