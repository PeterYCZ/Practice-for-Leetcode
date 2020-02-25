package com.learning.LongestPalindromicSubstring;

public class Solution {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int max = 0;
        int start = 0;
        int end = 0;
        for(int i = 0;i < s.length();i++){
            int len1 = findCenter(s,i,i);
            int len2 = findCenter(s,i,i+1);
            if(len1 > max){
                start = i - len1 / 2;
                end = i + len1 / 2 + 1;
                max = len1;
            }
            if(len2 > max){
                start = i - len2 / 2 + 1;
                end = i + len2 / 2 + 1;
                max = len2;
            }
        }
        return s.substring(start,end);

    }

    public int findCenter(String s,int l,int r){
        while(l >= 0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;
    }

}
