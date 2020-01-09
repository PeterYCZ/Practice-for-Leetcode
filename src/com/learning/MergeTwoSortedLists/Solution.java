package com.learning.MergeTwoSortedLists;

import com.learning.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode nextnode = new ListNode(0);
        ListNode head = nextnode;
        while(p!=null&&q!=null){
            if(p.val < q.val){
                nextnode.next = p;
                p = p.next;
                nextnode = nextnode.next;
            }else{
                nextnode.next = q;
                q = q.next;
                nextnode = nextnode.next;
            }
        }
        if(p == null&&q!=null){
            nextnode.next = q;
        }else if(q == null&&p!=null){
            nextnode.next = p;
        }
        return head.next;
    }
}
