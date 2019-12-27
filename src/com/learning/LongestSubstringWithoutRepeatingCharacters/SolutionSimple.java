package com.learning.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class SolutionSimple {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        char[] byteArray = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int n = byteArray.length;
        while(i < n && j < n){
            if(map.get(byteArray[j]) == null){
                map.put(byteArray[j],j);
                max = Math.max(max,map.size());
                j++;
            }else{
                map.remove(byteArray[i]);
                i++;
            }
        }
        return max;
    }

}
