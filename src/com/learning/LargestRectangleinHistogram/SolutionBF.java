package com.learning.LargestRectangleinHistogram;

public class SolutionBF {
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

}
