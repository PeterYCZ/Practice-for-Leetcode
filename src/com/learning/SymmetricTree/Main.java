package com.learning.SymmetricTree;

import com.learning.TreeNode;

public class Main {
    public static void main(String[] args) {
        /*
        TreeNode root = new TreeNode(2);
        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(3);
        root.left = left1;
        root.right = right1;
        TreeNode left21 = new TreeNode(4);
        TreeNode right22 = new TreeNode(5);
        TreeNode left23 = new TreeNode(5);
        TreeNode right24 = new TreeNode(4);
        left1.left = left21;
        left1.right = right22;
        right1.left = left23;
        right1.right = right24;
        TreeNode left33 = new TreeNode(8);
        TreeNode right34 = new TreeNode(9);
        TreeNode left37 = new TreeNode(9);
        TreeNode right38 = new TreeNode(8);
        right22.left = left33;
        right22.right = right34;
        right24.left = left37;
        right24.right = right38;
        */
        TreeNode root = new TreeNode(2);
        TreeNode left1 = new TreeNode(1);
        TreeNode right1 = new TreeNode(3);
        root.left = left1;
        root.right = right1;
        Solutionll solution = new Solutionll();
        System.out.println(solution.isSymmetric(root));

    }
}
