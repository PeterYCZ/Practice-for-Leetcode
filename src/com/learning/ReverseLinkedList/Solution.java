package com.learning.ReverseLinkedList;

import com.learning.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode result = new ListNode(0);
        while(p != null){
            ListNode tail = new ListNode(p.val);
            if(result.next != null){
                ListNode mid = result.next;
                result.next = tail;
                tail.next = mid;
            }else{
                result.next = new ListNode(p.val);
            }
            p = p.next;
        }

        return result.next;
    }

}
