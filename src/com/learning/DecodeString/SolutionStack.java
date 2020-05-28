package com.learning.DecodeString;

import java.util.LinkedList;
import java.util.Stack;

public class SolutionStack {
    public String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<String> strings = new Stack<>();
        String temp = "";
        String result = "";
        for(int i = 0;i < s.length();i++) {
            if (Character.isDigit(s.charAt(i))) {
                temp += s.substring(i,i+1);
            }else if(s.charAt(i) == '[') {
                numbers.push(Integer.valueOf(temp));
                temp = "";
                strings.push(s.substring(i,i+1));
            }else if(s.charAt(i) == ']'){
                int number = numbers.pop();
                String store = "";
                String next = strings.pop();
                while("[".equals(next) != true){
                    store = next + store;
                    next = strings.pop();
                }
                String stores = "";
                for(int j = 0;j<number;j++){
                    stores += store;
                }
                strings.push(stores);
            }else {
                strings.push(s.substring(i,i+1));
            }
        }
        int length = strings.size();
        for(int i = 0;i<length;i++){
            result = strings.pop()+result;
        }
        return result;
    }
}
