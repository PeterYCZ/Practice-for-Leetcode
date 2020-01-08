package com.learning.MyCircularDeque;

public class MyCircularDequeArray {

    private int[] deque;
    private int size;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDequeArray(int k) {
        this.size = k;
        this.deque = new int[k];
        for(int i = 0;i<k;i++){
            this.deque[i] = -1;
        }
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        int i = size - 1;
        if(isFull() == true){
            return false;
        }
        while(i > 0){
            deque[i] = deque[i-1];
            i--;
        }
        deque[0] = value;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        System.out.print("isFull "+isFull() +"||");
        int i = 0;
        if(isFull() == true){
            return false;
        }
        while(i < size){
            if(deque[i] == -1){
                deque[i] = value;
                break;
            }else{
                i++;
            }
        }
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        int i = 0;
        if(this.isEmpty() == true){
            return false;
        }
        while(i < size - 1){
            deque[i] = deque[i+1];
            i++;
        }
        if (deque[size - 1] != -1){
            deque[size - 1] = -1;
        }
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        int i = size -1;
        if(this.isEmpty() == true){
            return false;
        }
        while(i > -1){
            if(deque[i] != -1){
                deque[i] = -1;
                break;

            }else {
                i--;
            }
        }
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        return deque[0];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        int i = size -1;
        int rear = -1;
        while(i > -1){
            if(deque[i] != -1){
                rear = deque[i];
                break;
            }
            i--;
        }
        return rear;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        int i = 0;
        while(i<size){
            if(deque[i] != -1){
                return false;
            }
            i++;
        }
        return true;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        int i = 0;
        while(i<size){
            if(deque[i] == -1){
                return false;
            }
            i++;
        }
        return true;
    }

}
