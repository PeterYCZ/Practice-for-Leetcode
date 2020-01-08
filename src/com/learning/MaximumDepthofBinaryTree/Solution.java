package com.learning.MaximumDepthofBinaryTree;

import com.learning.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        int left = 0;
        int right = 0;
        if(root == null){
            return 0;
        }
        else{
            if(root.left != null){
                left = maxDepth(root.left);
            }
            if(root.right != null){
                right = maxDepth(root.right);
            }
            int max = left>right?left:right;
            return 1+max;
        }
    }

}
