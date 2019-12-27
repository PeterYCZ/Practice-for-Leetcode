package com.learning.AddTwoNumbers;

import com.learning.ListNode;

import java.util.List;

public class SolutionSimple {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = null;
        ListNode pointNode = resultNode;
        ListNode next1 = l1;
        ListNode next2 = l2;
        int add = 0;
        while(next1 != null && next2 != null){
            int result = next1.val + next2.val + add;
            add = 0;
            if(result > 9){
                ListNode node = new ListNode(result - 10);
                if(pointNode == null){
                    resultNode = node;
                    pointNode = node;
                }else{
                    pointNode.next = node;
                    pointNode = node;
                }
                add = 1;
            }else{
                ListNode node = new ListNode(result);
                if(pointNode == null){
                    resultNode = node;
                    pointNode = node;
                }else{
                    pointNode.next = node;
                    pointNode = node;
                }
            }
            next1 = next1.next;
            next2 = next2.next;
        }
        while(next1 != null){
            int result = next1.val + add;
            add = 0;
            if(result > 9){
                ListNode node = new ListNode(result - 10);
                if(pointNode == null){
                    resultNode = node;
                    pointNode = node;
                }else{
                    pointNode.next = node;
                    pointNode = node;
                }
                add = 1;
            }else{
                ListNode node = new ListNode(result);
                if(pointNode == null){
                    resultNode = node;
                    pointNode = node;
                }else{
                    pointNode.next = node;
                    pointNode = node;
                }
            }
        }
        while(next2 != null){
            int result = next2.val + add;
            add = 0;
            if(result > 9){
                ListNode node = new ListNode(result - 10);
                if(pointNode == null){
                    resultNode = node;
                    pointNode = node;
                }else{
                    pointNode.next = node;
                    pointNode = node;
                }
                add = 1;
            }else{
                ListNode node = new ListNode(result);
                if(pointNode == null){
                    resultNode = node;
                    pointNode = node;
                }else{
                    pointNode.next = node;
                    pointNode = node;
                }
            }
        }
        if(add == 1){
            pointNode.next = new ListNode(1);
        }
        return resultNode;
    }
}
