package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/13 10:43
 */
class MaxQueue {

    //  方法一
//    private Deque<Integer> deque=new LinkedList<>();
//
//    public MaxQueue() {
//
//    }
//
//    public int max_value() {
//        if(deque.isEmpty()){
//            return -1;
//        }else{
//            int max=0;
//            for (Integer integer : deque) {
//                if(max<integer){
//                    max=integer;
//                }
//            }
//            return max;
//        }
//
//    }
//
//    public void push_back(int value) {
//        deque.addLast(value);
//    }
//
//    public int pop_front() {
//        return deque.isEmpty()? -1:deque.pollFirst();
//    }

    //  方法二

    Queue<Integer> queue;
    Deque<Integer> deque;

    public MaxQueue() {
        queue=new LinkedList<>();
        deque=new LinkedList<>();
    }

    public int max_value() {
        return deque.isEmpty()?-1:deque.peek();
    }

    public void push_back(int value) {
        queue.add(value);
        while ( !deque.isEmpty() ){
            Integer last = deque.getLast();
            if(last<value){
                deque.pollLast();
            }else {
                break;
            }
        }
        deque.add(value);
    }

    public int pop_front() {
        if(queue.isEmpty() ){
            return -1;
        }else{
            Integer peek = queue.peek();
            if(peek.equals(deque.getFirst())){
                deque.pollFirst();
            }
            return queue.poll();
        }
    }
}
