package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/28 10:42
 */
public class removeStars {
    public String removeStars(String s) {
        char[] stack=new char[s.length()];
        int base=0,top=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c!='*'){
                stack[top]=c;
                top++;
            }else{
                top--;
            }
        }
        String res="";
        for (int i = 0; i < top; i++) {
            res+=stack[i];
        }
        return res;
    }
}
