package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/12 8:53
 */
public class t59_Iguanfang {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] pair1, int[] pair2) {
                return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
            }
        });
        for (int i = 0; i < k; ++i) {
            pq.offer(new int[]{nums[i], i});
        }
        int[] ans = new int[n - k + 1];
        ans[0] = pq.peek()[0];
        for (int i = k; i < n; ++i) {
            pq.offer(new int[]{nums[i], i});
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            ans[i - k + 1] = pq.peek()[0];
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>( (x, y) ->y-x);
        set.add(100);
        set.add(200);
        set.add(400);
        set.add(300);
        System.out.println(set);
    }

    public int[] maxSlidingWindow2(int[] nums, int k){
        if(nums.length == 0 || k == 0){
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for(int j = 0, i = 1 - k; j < nums.length; i++, j++){

        }
        return res;
    }
}
