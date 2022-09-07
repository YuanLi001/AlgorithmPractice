package com.example.algorithmpractice.specialbreakthrough.five;

import javafx.util.Pair;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/7 15:46
 */
public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>( (a,b)-> a.getValue()-b.getValue() );
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1 );
        }
        for( Map.Entry<Integer,Integer> entry: map.entrySet() ){
            if(pq.size()==k){
                Pair<Integer, Integer> peek = pq.peek();
                if(entry.getValue() >peek.getValue()){
                    pq.poll();
                    pq.add( new Pair<>(entry.getKey(), entry.getValue()) );
                }
            }else {
                pq.add( new Pair<>(entry.getKey(), entry.getValue()) );
            }
        }
        int[] arr=new int[k];
        for (int i = 0; i < k; i++) {
            arr[i]=pq.poll().getKey();
        }
        return arr;
    }
}
