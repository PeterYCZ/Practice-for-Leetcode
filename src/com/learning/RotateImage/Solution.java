package com.learning.RotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                temp[i][j] = matrix[i][j];
            }
        }
        for(int i = 0;i<n;i++){
            int col = n - i - 1;
            for(int j = 0;j<n;j++){
                matrix[j][col] = temp[i][j];
            }
        }
    }
}
