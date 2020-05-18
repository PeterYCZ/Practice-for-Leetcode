package com.learning.PalindromeLinkedList;

import com.learning.ListNode;

import java.util.Stack;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        boolean result = true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = slow.next;
        slow.next = null;

        ListNode reverse = null;
        ListNode prev = null;

        while(fast != null){
            reverse = fast;
            fast = fast.next;
            reverse.next = prev;
            prev = reverse;
        }

        while(head != null && prev != null){
            if(head.val != prev.val){
                return false;
            }else{
                head = head.next;
                prev = prev.next;
            }
        }

        return result;
    }

}
