package com.example.algorithmpractice.specialbreakthrough.five;


import javafx.util.Pair;

import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/5 8:35
 */
public class MostBooked_III {
    public int mostBooked(int n, int[][] meetings) {
        int[] cnt=new int[n];
        PriorityQueue<Integer> idle=new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            idle.offer(i);
        }
        PriorityQueue<Pair<Long,Integer>> using=new PriorityQueue<Pair<Long, Integer>>((a, b) -> !Objects.equals(a.getKey(), b.getKey()) ? Long.compare(a.getKey(), b.getKey()) : Integer.compare(a.getValue(), b.getValue()));
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        for(int[] m :meetings){
            long st = m[0], end = m[1];
            while ( !using.isEmpty() && using.peek().getKey()<=st){
                idle.offer( using.poll().getValue() );  //添加空闲会议室
            }
            int id;
            if( idle.isEmpty()){
                Pair<Long, Integer> p = using.poll();
                end+=(p.getKey()-st);
                id=p.getValue();
            }else {
                id=idle.poll();
            }
            cnt[id]++;
            using.offer(new Pair<>(end,id) );
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
            if(cnt[i]>cnt[ans]) ans=i;
        }
        return ans;
    }
}
