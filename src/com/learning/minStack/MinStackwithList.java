package com.learning.minStack;

public class MinStackwithList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    private ListNode head;
    private int minValue = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStackwithList() {
        head = new ListNode(Integer.MAX_VALUE);
    }

    public void push(int x) {
        if(x < minValue){
            minValue = x;
        }
        ListNode insert = new ListNode(x);
        insert.next = head.next;
        head.next = insert;
    }

    public void pop() {
        ListNode del = head.next;
        if(del != null) {
            head.next = del.next;
            if(del.val == minValue) {
                minValue = Integer.MAX_VALUE;
                ListNode point = head.next;
                while (point != null) {
                    if (minValue > point.val) {
                        minValue = point.val;
                    }
                    point = point.next;
                }
                if (head.next == null) {
                    minValue = Integer.MAX_VALUE;
                }
            }
        }
    }

    public int top() {
        return head.next.val;
    }

    public int getMin() {
        return minValue;
    }
}



