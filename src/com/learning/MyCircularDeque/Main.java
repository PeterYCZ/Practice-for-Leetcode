package com.learning.MyCircularDeque;

import com.learning.MedianofTwoSortedArrays.Solution;

public class Main {

    /*
    ["MyCircularDeque","insertFront","getFront","isEmpty","deleteFront","insertLast","getRear","insertLast","insertFront","deleteLast","insertLast","isEmpty"]
    [[8],[5],[],[],[],[3],[],[7],[7],[],[4],[]]

    ["MyCircularDeque","insertFront","insertFront","insertLast","deleteLast","insertLast","getRear","insertLast","getFront","deleteFront","insertLast","insertLast"]
    [[5],[5],[0],[5],[],[7],[],[7],[],[],[6],[1]]

     */
    public static void main(String[] args) {
        MyCircularDequeArray circularDeque = new MyCircularDequeArray(5);
        System.out.println(circularDeque.insertFront(5));
        System.out.println(circularDeque.insertFront(0));
        System.out.println(circularDeque.insertLast(5));
        System.out.println(circularDeque.deleteLast());
        System.out.println(circularDeque.insertLast(7));
        System.out.println(circularDeque.getRear());
        System.out.println(circularDeque.insertLast(7));
        System.out.println(circularDeque.getFront());
        System.out.println(circularDeque.deleteFront());
        System.out.println(circularDeque.insertLast(6));
        System.out.println(circularDeque.insertLast(1));
    }

}
