package com.learning.RotateImage;

public class Main {
    public static void main(String[] args){
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Solution solution = new Solution();
        solution.rotate(matrix);
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }
}
