package com.learning.SortList;

import com.learning.ListNode;

public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode second = new ListNode(-2);
        ListNode first = new ListNode(1,second);
        ListNode head = new ListNode(3,first);
        ListNode result = solution.sortList(head);
        while(result != null){
            System.out.print(result.val+ " ");
            result = result.next;
        }
    }

}
