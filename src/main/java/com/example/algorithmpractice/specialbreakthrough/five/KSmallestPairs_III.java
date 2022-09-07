package com.example.algorithmpractice.specialbreakthrough.five;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/7 21:35
 */
public class KSmallestPairs_III {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> nums1[a[0]] + nums2[a[1]] - nums1[b[0]] - nums2[b[1]]);
//        PriorityQueue<int[]> pq = new PriorityQueue<>(k, (o1, o2)-> nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]]);
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < Math.min(m, k); i++) {
            pq.add(new int[]{i, 0});
        }
        while (k > 0&& !pq.isEmpty()) {
            int[] poll = pq.poll();
            List<Integer> list = new ArrayList<>();
            list.add(nums1[poll[0]]);
            list.add(nums2[poll[1]]);
            ret.add(list);
            if (poll[1] + 1 < n) {
                pq.add(new int[]{poll[0], poll[1] + 1});
            }
            k--;
        }
        return ret;
    }
}
