package com.learning.MergeTwoSortedLists;

import com.learning.ListNode;

public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(10);
        l1.next = new ListNode(11);
        ListNode l2 = new ListNode(8);
        l2.next = new ListNode(12);
        Solution solution = new Solution();
        ListNode result = solution.mergeTwoLists(l1,l2);
        while(result!=null){
            System.out.print(result.val +" ");
            result = result.next;
        }
    }

}
