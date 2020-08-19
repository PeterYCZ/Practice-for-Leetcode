package com.learning.SortCharactersByFrequency;

import java.util.*;

public class Solution {
    public String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        HashMap<Character,Integer> count = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> aList = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : count.entrySet()){
            aList.add(entry);
        }
        Collections.sort(aList,new Comparator<Map.Entry<Character,Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Map.Entry<Character,Integer> entry:aList){
            int times = entry.getValue();
            for(int i = 0;i<times;i++){
                result.append(entry.getKey());
            }
        }
        return result.toString();
    }
}
