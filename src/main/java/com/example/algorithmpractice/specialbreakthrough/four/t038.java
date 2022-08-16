package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/16 9:37
 */
public class t038 {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans=new int[len];
        Deque<Integer> deque=new LinkedList<>();
        for (int i = 0; i < len; i++) {
            if(i==0){
                deque.add(0);
            }else{
                Integer peek = deque.peek();
                while (peek!=null && temperatures[peek]<temperatures[i]){
                    ans[peek]=i-peek;
                    deque.pop();
                    peek = deque.peek();
                }
                deque.push(i);
            }
        }
        return ans;
    }
}
