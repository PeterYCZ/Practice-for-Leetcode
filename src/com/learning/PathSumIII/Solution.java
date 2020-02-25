package com.learning.PathSumIII;

import com.learning.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int pathSum(TreeNode root, int sum) {
        int result = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        if(root != null){
            queue.push(root);
        }
        while(queue.isEmpty() == true){
            TreeNode temp = queue.poll();

        }
        return result;
    }
}
