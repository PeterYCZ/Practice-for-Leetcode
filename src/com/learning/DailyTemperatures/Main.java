package com.learning.DailyTemperatures;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] T = {65,68,70,71,70,69,68,79};
        int[] result = solution.dailyTemperatures(T);
        for(int i:result){
            System.out.print(i + " ");
        }
    }

}
