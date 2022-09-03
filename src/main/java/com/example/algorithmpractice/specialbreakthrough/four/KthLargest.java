package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.PriorityQueue;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/3 9:27
 */
public class KthLargest {
    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<Integer>();
        for (int x : nums) {
            add(x);
        }
    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }

}
