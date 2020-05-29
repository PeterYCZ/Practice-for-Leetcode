package com.learning.FirstUniqueCharacterInAString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> stores = new HashMap<>();
        for(Character c : chars){
            stores.put(c, stores.getOrDefault(c, 0) + 1);
        }
        for(int i = 0;i<chars.length;i++){
            if(stores.get(chars[i]) == 1){
                return i;
            }
        }
        return -1;
    }
}
