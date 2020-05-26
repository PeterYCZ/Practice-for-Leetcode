package com.learning.ValidParentheses;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        boolean result = true;
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++) {
            char b = s.charAt(i);
            if(stack.size() == 0){
                stack.push(b);
            }else{
                if(b == ')'){
                    if(stack.pop() == '('){
                        continue;
                    }else{
                        return false;
                    }
                }else if(b == '}'){
                    if(stack.pop() == '{'){
                        continue;
                    }else{
                        return false;
                    }
                }else if(b == ']'){
                    if(stack.pop() == '['){
                        continue;
                    }else{
                        return false;
                    }
                }else{
                    stack.push(b);
                }
            }
        }
        if(stack.size() > 0){
            result = false;
        }
        return result;
    }

}
