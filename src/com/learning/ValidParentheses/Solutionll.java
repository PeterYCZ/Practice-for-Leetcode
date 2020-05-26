package com.learning.ValidParentheses;

import java.util.HashMap;
import java.util.Stack;

public class Solutionll {

    private HashMap<Character,Character> mapping = new HashMap<>();

    Solutionll(){
        mapping.put(')','(');
        mapping.put('}','{');
        mapping.put(']','[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i<s.length();i++){
            char x = s.charAt(i);
            if(mapping.containsKey(x)){
                if (stack.empty()) {
                    stack.push(x);
                }else{
                    char top = stack.pop();
                    if(top != mapping.get(x)){
                        return false;
                    }
                }
            }else{
                stack.push(x);
            }
        }
        return stack.isEmpty();
    }
}
