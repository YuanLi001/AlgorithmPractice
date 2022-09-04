//package com.example.algorithmpractice.specialbreakthrough.five;
//
//import javafx.util.Pair;
//
//import java.util.Arrays;
//import java.util.Objects;
//import java.util.PriorityQueue;
//
///**
// * @author YuanLi
// * @version 1.0
// * @date 2022/9/4 17:52
// */
//public class MostBooked_II {
//    public int mostBooked(int n, int[][] meetings) {
//        var cnt = new int[n];
//        var idle = new PriorityQueue<Integer>((a, b) -> Integer.compare(a, b));
//        for (var i = 0; i < n; ++i) idle.offer(i);
//        var using = new PriorityQueue<Pair<Long, Integer>>((a, b) -> !Objects.equals(a.getKey(), b.getKey()) ? Long.compare(a.getKey(), b.getKey()) : Integer.compare(a.getValue(), b.getValue()));
//        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
//        for (var m : meetings) {
//            long st = m[0], end = m[1];
//            while (!using.isEmpty() && using.peek().getKey() <= st) {
//                idle.offer(using.poll().getValue()); // 维护在 st 时刻空闲的会议室
//            }
//            int id;
//            if (idle.isEmpty()) {
//                var p = using.poll(); // 没有可用的会议室，那么弹出一个最早结束的会议室
//                end += p.getKey() - st; // 更新当前会议的结束时间
//                id = p.getValue();
//            } else id = idle.poll();
//            ++cnt[id];
//            using.offer(new Pair<>(end, id)); // 使用一个会议室
//        }
//        var ans = 0;
//        for (var i = 0; i < n; ++i) if (cnt[i] > cnt[ans]) ans = i;
//        return ans;
//    }
//
//}
