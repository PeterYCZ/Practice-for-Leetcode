package com.learning.findDisappearedNumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SolutionMap {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Boolean> set = new HashMap<>();
        for(int i = 1;i <= nums.length;i++){
            set.put(i,false);
        }
        for(int i : nums){
            set.remove(i);
        }
        for(int i : set.keySet()){
            result.add(i);
        }
        return result;
    }
}
