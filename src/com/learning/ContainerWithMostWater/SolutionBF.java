package com.learning.ContainerWithMostWater;

public class SolutionBF {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i = 0;i<height.length;i++){
            for(int j = i;j<height.length;j++){
                max = Math.max(max,(j-i)*Math.min(height[i],height[j]));
            }
        }
        return max;
    }
}
