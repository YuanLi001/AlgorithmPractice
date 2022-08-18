package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/18 11:32
 */
public class RecentCounter {
    Deque<Integer> deque;

    public RecentCounter() {
        deque=new LinkedList<>();
    }

    public int ping(int t) {
        while (!deque.isEmpty() && deque.getFirst()<t-3000){
            deque.removeFirst();
        }
        deque.add(t);
        return deque.size();
    }

}
