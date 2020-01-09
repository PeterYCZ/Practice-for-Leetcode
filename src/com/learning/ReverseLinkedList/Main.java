package com.learning.ReverseLinkedList;

import com.learning.ListNode;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(10);
        l1.next = new ListNode(11);
        Solution solution = new Solution();
        ListNode result = solution.reverseList(l1);
        while(result!=null){
            System.out.print(result.val +" ");
            result = result.next;
        }
    }
}
