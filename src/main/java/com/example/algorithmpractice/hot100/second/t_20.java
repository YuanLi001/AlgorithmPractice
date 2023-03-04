package com.example.algorithmpractice.hot100.second;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static javax.swing.UIManager.put;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/4 9:37
 */
public class t_20 {
//    public boolean isValid(String s) {
//        int n = s.length();
//        if (n % 2 == 1) {
//            return false;
//        }
//
//        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
//            put(')', '(');
//            put(']', '[');
//            put('}', '{');
//        }};
//        Deque<Character> stack = new LinkedList<Character>();
//        for (int i = 0; i < n; i++) {
//            char ch = s.charAt(i);
//            if (pairs.containsKey(ch)) {
//                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
//                    return false;
//                }
//                stack.pop();
//            } else {
//                stack.push(ch);
//            }
//        }
//        return stack.isEmpty();
//    }

    public boolean isValid(String s){
        int n=s.length();
        if(n%2==1){
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>();
        pairs.put(')','(');
        pairs.put(']', '[');
        pairs.put('}', '{');
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)){
                if( pairs.isEmpty() || pairs.get( ch )!= stack.peek() ){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

}
