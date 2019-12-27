package com.learning.AddTwoNumbers;

import com.learning.ListNode;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ListNode l1 = new ListNode(random.nextInt(9));
        ListNode l2 = new ListNode(random.nextInt(9));
        ListNode node1 = l1;
        ListNode node2 = l2;
        for(int i = 0;i<5;i++){
            ListNode node = new ListNode(random.nextInt(9));
            node1.next = node;
            node1 = node;
            node2.next = node;
            node2 = node;
        }
        ListNode next = l1;
        while(next != null){
            System.out.print(next.val+"->");
            next = next.next;
        }
        System.out.println();
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1,l2);
        next = result;
        while(next != null){
            System.out.print(next.val+"->");
            next = next.next;
        }


    }
}
