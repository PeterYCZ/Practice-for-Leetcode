package com.learning.MaximalRectangle;

public class Main {
    public static void main(String[] args) {
        char[] x0 = {'1','0','1','0','0'};
        char[] x1 = {'1','0','1','1','1'};
        char[] x2 = {'1','1','1','1','1'};
        char[] x3 = {'1','0','0','1','0'};
        char[][] test = new char[4][6];
        test[0] = x0;
        test[1] = x1;
        test[2] = x2;
        test[3] = x3;
        Solution solution = new Solution();
        System.out.println(solution.maximalRectangle(test));

    }
}
