package com.learning.IntersectionofTwoLinkedLists;

import com.learning.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nextA = headA;
        ListNode nextB = headB;
        while(nextA != null || nextB != null){
            if(nextA == nextB){
                return nextA;
            }else{
                if(nextA != null) {
                    nextA = nextA.next;
                }else{
                    nextA = headB;
                }
                if(nextB != null) {
                    nextB = nextB.next;
                }else{
                    nextB = headA;
                }
            }
        }
        return null;
    }
}
