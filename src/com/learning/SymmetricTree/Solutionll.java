package com.learning.SymmetricTree;

import com.learning.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solutionll {
    public boolean isSymmetric(TreeNode root) {
        boolean result = true;
        if(root == null){
            return result;
        }
        TreeNode tree = reverse(root);
        System.out.println(tree);
        return result;
    }
    public TreeNode reverse(TreeNode root){
        if(root.right != null && root.left != null){
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            root.left = reverse(root.left);
            root.right = reverse(root.right);
        }else if(root.right != null && root.left == null){
            root.left = root.right;
            root.right = null;
            root.left = reverse(root.left);
        }else if(root.right != null && root.left == null){
            root.right = root.left;
            root.left = null;
            root.right = reverse(root.right);
        }else{
            return root;
        }
        return root;
    }
}
