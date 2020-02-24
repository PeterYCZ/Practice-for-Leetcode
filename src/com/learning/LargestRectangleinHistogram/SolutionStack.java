package com.learning.LargestRectangleinHistogram;

import java.util.Stack;

public class SolutionStack {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int h = 0;
        int w = 0;
        int max = 0;
        for(int i = 0;i < heights.length;i++){
            if(stack.isEmpty() || heights[i] > heights[stack.peek()]){
                stack.push(i);
            }else{
                while(stack.isEmpty()!=true && heights[i] < heights[stack.peek()]){
                    h = heights[stack.peek()];
                    stack.pop();
                    if(stack.empty()){
                        w = i;
                    }else{
                        w = i - heights[stack.peek()] - 1;
                    }
                    max = Math.max(max,h*w);
                }
                stack.push(i);
            }

        }
        return max;
    }
}
