package com.learning.LongestSubstringWithoutRepeatingCharacters;

public class Main {
    public static void main(String[] args) {
        String str = "abcabcbb";
        SolutionSimple solution = new SolutionSimple();
        int result = solution.lengthOfLongestSubstring(str);
        System.out.println(result);
    }
}
