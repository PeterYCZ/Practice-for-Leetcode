package com.learning.SymmetricTree;

import com.learning.TreeNode;

import java.util.*;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int n = 1;
        boolean result = true;
        if(root == null){
            return false;
        }
        queue.add(root);
        int k = 0;
        while(k != n){
            int i = 0;
            int j = n;
            int[] temp = new int[j];
            k = 0;
            while(i < j){
                TreeNode node = queue.peek();
                queue.poll();
                temp[i] = node.val;
                if(node.left != null) {
                    queue.add(node.left);
                }else{
                    queue.add(new TreeNode(Integer.MAX_VALUE));
                    k++;
                }
                if(node.right != null) {
                    queue.add(node.right);
                }else{
                    queue.add(new TreeNode(Integer.MAX_VALUE));
                    k++;
                }
                i++;
            }
            i = 0;
            j = temp.length - 1;
            while(i<j){
                if(temp[i] != temp[j]){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }
            n *= 2;
        }
        return result;
    }

}
