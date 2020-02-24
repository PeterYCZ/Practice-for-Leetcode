package com.learning.BestTimetoBuyandSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int result = 0;
        int max = 0;
        for(int i = 0;i < length - 1;i++){
            for(int j = i + 1;j<length;j++){
                if(prices[j] - prices[i] > max){
                    max = prices[j] - prices[i];
                    result = j - i;
                }
            }
        }
        return result;
    }
}
