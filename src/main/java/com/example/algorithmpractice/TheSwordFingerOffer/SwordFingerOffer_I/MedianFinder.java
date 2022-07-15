package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/27 11:11
 */
public class MedianFinder {
//    PriorityQueue<Integer> queMin;
//    PriorityQueue<Integer> queMax;
//
//    public MedianFinder() {
//        queMin = new PriorityQueue<Integer>((a, b) -> (b - a));
//        queMax = new PriorityQueue<Integer>((a, b) -> (a - b));
//    }
//
//    public void addNum(int num) {
//        if (queMin.isEmpty() || num <= queMin.peek()) {
//            queMin.offer(num);
//            if (queMax.size() + 1 < queMin.size()) {
//                queMax.offer(queMin.poll());
//            }
//        } else {
//            queMax.offer(num);
//            if (queMax.size() > queMin.size()) {
//                queMin.offer(queMax.poll());
//            }
//        }
//    }
//
//    public double findMedian() {
//        if (queMin.size() > queMax.size()) {
//            return queMin.peek();
//        }
//        return (queMin.peek() + queMax.peek()) / 2.0;
//    }


    Queue<Integer> A, B;
    public MedianFinder() {
        A = new PriorityQueue<>(); // 小顶堆，保存较大的一半
        B = new PriorityQueue<>((x, y) -> (y - x)); // 大顶堆，保存较小的一半
    }
    public void addNum(int num) {
        if(A.size() != B.size()) {
            A.add(num);
            B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }
    public double findMedian() {
        return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
    }

}
