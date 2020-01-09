package com.learning.hasCycle;

import com.learning.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        try {
            while (p.next != null || q.next != null) {
                p = p.next;
                q = q.next.next;
                if (p == q) {
                    return true;
                }
            }
        }catch (Exception e){
            return false;
        }
        return false;
    }
}
