package com.learning.PalindromicSubstrings;

public class Solution {

    public int countSubstrings(String s) {
        int result = 0;
        int length = s.length();
        for(int i = 1;i<=length;i++){
            for(int j = 0;j+i<=length;j++){
                result += isPalindromic(s.substring(j,j+i))?1:0;
            }
        }
        return result;
    }

    public boolean isPalindromic(String str){
        int length = str.length();
        if(length == 1){
            return true;
        }else {
            int i = 0;
            int j = length - 1;
            while(i < j){
                if(str.charAt(i) != str.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }

}
