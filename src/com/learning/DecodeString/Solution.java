package com.learning.DecodeString;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public String decodeString(String s) {
       String number = "";
       int count = 0;
       String result = "";
       String temp = "";
       int isresult = 0;
       for(int i = 0;i < s.length();i++){
           if(Character.isDigit(s.charAt(i))){
                if(count == 0){
                    number += s.substring(i,i+1);
                }else{
                    temp += s.substring(i,i+1);
                }
           }else if(s.charAt(i) == '['){
               isresult++;
               if(count != 0){
                   temp += "[";
               }
               count++;
           }else if(s.charAt(i) == ']'){
               count--;
               if(count != 0){
                   temp += "]";
               }else {
                   int times = Integer.valueOf(number);
                   for(int j = 0;j<times;j++){
                       result += temp;
                   }
                   number = "";
                   temp = "";
               }
           }else {
                if(count == 0){
                    result += s.substring(i,i+1);
                }else{
                    temp += s.substring(i,i+1);
                }
           }
       }
       if(isresult != 0){
           return decodeString(result);
       }
       return result;
    }
}
