package com.learning.ReverseLinkedList;

import com.learning.ListNode;

public class Solutionll {

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head;
        ListNode prev = null;
        ListNode reverse = null;
        while(next != null){
            reverse = next;
            next = next.next;
            reverse.next = prev;
            prev = reverse;
        }
        return prev;
    }
}
