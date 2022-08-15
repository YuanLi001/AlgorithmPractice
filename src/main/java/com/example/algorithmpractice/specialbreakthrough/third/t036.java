package com.example.algorithmpractice.specialbreakthrough.third;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/15 8:05
 */
public class t036 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new LinkedList<>();
        int len = tokens.length;
        for (int i = 0; i < len; i++) {
            String token = tokens[i];
            if(isNum(token)){
                stack.push( Integer.parseInt(token) );
            }else{
                Integer n1 = stack.pop();
                Integer n2 = stack.pop();
                switch (token){
                    case "+":
                        stack.push(n1+n2);
                        break;
                    case "-":
                        stack.push(n2-n1);
                        break;
                    case "*":
                        stack.push(n1*n2);
                        break;
                    case "/":
                        stack.push(n2/n1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public boolean isNum(String str){
        return !("+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str));
    }
}
