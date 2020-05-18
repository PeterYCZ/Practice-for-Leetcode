package com.learning.PalindromeLinkedList;

import com.learning.ListNode;

public class Main {

    public static void main(String[] args){
        Solution solutionStack = new Solution();
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next= new ListNode(1);
        System.out.println(solutionStack.isPalindrome(node));
    }
}
