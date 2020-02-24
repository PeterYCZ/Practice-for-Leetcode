package com.learning.diameterOfBinaryTree;

import com.learning.TreeNode;

public class Solution {
    int result = 1;

    public int getdeep(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getdeep(root.left);
        int right = getdeep(root.right);
        result = Math.max(result,left+right+1);
        return Math.max(left,right)+1;
    }


    public int diameterOfBinaryTree(TreeNode root) {
        getdeep(root);
        return result - 1;
    }
}
