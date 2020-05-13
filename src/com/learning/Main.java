package com.learning;

import com.learning.TwoSum.SolutionHash;

public class Main {

    public static void add (test x){
        x.setX(x.getX()+1);
    }

    static class test{

        private int x;

        test(int x){
            this.x = x;
        }

        public void setX(int x){
            this.x = x;
        }

        public int getX(){
            return x;
        }

    }

    public static void main(String[] args) {
        test y = new test(1);
        add(y);
        System.out.println(y.getX());

    }
}
