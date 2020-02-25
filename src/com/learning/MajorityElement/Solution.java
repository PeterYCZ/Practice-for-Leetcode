package com.learning.MajorityElement;

import java.util.HashMap;

public class Solution {

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap();
        int max = 0;
        int target = 0;
        for(int i:nums){
            if(count.get(i) != null) {
                count.put(i,count.get(i) + 1);
                if(max < count.get(i)){
                    max = count.get(i);
                    target = i;
                }
            }else{
                count.put(i,1);
                if(max < count.get(i)){
                    max = count.get(i);
                    target = i;
                }
            }
        }
        return target;
    }

}
