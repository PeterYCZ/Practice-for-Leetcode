package com.learning.IntersectionofTwoLinkedLists;

import com.learning.ListNode;

public class SolutionBF {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nextA = headA;
        ListNode nextB = headB;
        while(nextA != null){
            while(nextB != null){
                if(nextA == nextB){
                    return nextA;
                }else {
                    nextB = nextB.next;
                }
            }
            nextA = nextA.next;
            nextB = headB;
        }
        return null;
    }
}
