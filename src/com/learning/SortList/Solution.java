package com.learning.SortList;

import com.learning.ListNode;

//Time Limit Exceeded
public class Solution {

    public ListNode sortList(ListNode head) {

        int change = Integer.MAX_VALUE;

        ListNode first = new ListNode();
        first.next = head;

        while(change > 0){
            change = 0;
            ListNode next = first.next;
            ListNode last = first;
            while(next != null){
                if(next.next != null){
                    if(next.next.val < next.val){
                        ListNode tempNode = next.next;
                        next.next = next.next.next;
                        tempNode.next = next;
                        last.next = tempNode;
                        last = tempNode;
                        change += 1;
                    }else{
                        last = next;
                        next = next.next;
                    }
                }else{
                    break;
                }
            }
        }
        return first.next;
    }

}
