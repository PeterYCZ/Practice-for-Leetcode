package com.learning.MaximalRectangle;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for(int i = 0;i<heights.length;i++){
            int low = heights[i];
            for(int j = i;j<heights.length;j++){
                if(heights[j] == 0){
                    break;
                }
                if(low > heights[j]){
                    low = heights[j];
                }
                if(max < (low * (j - i + 1))){
                    max = low * (j - i + 1);
                }
            }
        }
        return max;
    }


    public int maximalRectangle(char[][] matrix) {
        int[] last = null;
        int max = 0;
        for(int i = 0;i<matrix.length;i++){
            int[] temp = new int[matrix[i].length];
            for(int j = 0;j<matrix[i].length;j++){
                temp[j] = matrix[i][j] - '0';
            }
            if(last == null){
                max = largestRectangleArea(temp);
                last = temp;
            }else{
                for(int j = 0;j<matrix[i].length;j++){
                    if(temp[j] != 0) {
                        temp[j] = temp[j] + last[j];
                    }
                }
                max = Math.max(max,largestRectangleArea(temp));
                last = temp;
            }
        }
        return max;
    }
}
