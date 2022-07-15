package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Other;

import java.util.Deque;
import java.util.Stack;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/11 9:38
 */
public class t5 {
    public boolean isValid(String s) {
        //如果长度为奇数，直接返回false
        int len = s.length();
        if(len%2==1){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if( ch=='('|| ch=='[' || ch=='{'){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                Character peek = stack.peek();
                boolean b = canPop(peek, ch);
                if(b){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public boolean canPop(Character peek,Character ch){
        if( ch==')' && peek=='('){
            return true;
        }else if(ch==']' && peek=='[' ){
            return true;
        }else if(ch=='}' && peek=='{' ){
            return true;
        }
        return false;
    }


}
