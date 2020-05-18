package com.learning.PalindromeLinkedList;

import com.learning.ListNode;

import java.util.Stack;

public class SolutionStack {

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        boolean result = true;
        Stack<ListNode> stack = new Stack<>();
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        while(fast != null){
            stack.push(fast);
            fast = fast.next;
        }
        int i = 0;
        int length = stack.size();
        while(i < length){
            ListNode node = stack.pop();
            if(head.val == node.val){
                head = head.next;
                i++;
            }else{
                result = false;
                break;
            }

        }
        return result;
    }

}
