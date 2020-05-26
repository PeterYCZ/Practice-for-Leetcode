package com.learning.TopKFrequentElements;

import java.util.*;

public class SolutionBF {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> store = new HashMap<>();
        int[] result = new int[k];
        for(int i : nums){
            if(store.get(i) == null){
                store.put(i,1);
            }else {
                store.put(i,store.get(i) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(store.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for(int i = 0;i<result.length;i++){
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}
