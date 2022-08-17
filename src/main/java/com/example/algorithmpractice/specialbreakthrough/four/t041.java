package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/17 21:24
 */
public class t041 {
    Queue<Integer> queue;
    int size;
    double sum;

    public t041(int size) {
        queue = new ArrayDeque<Integer>();
        this.size = size;
        sum = 0;
    }

    public double next(int val) {
        if (queue.size() == size) {
            sum -= queue.poll();
        }
        queue.offer(val);
        sum += val;
        return sum / queue.size();
    }
}
