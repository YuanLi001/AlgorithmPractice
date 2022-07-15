package com.example.algorithmpractice.designproblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/27 21:33
 */
public class LRUCache_I {
    Map<Integer,Integer> map;
    int capacity;
    public LRUCache_I(int capacity) {
        this.capacity=capacity;
        map=new LinkedHashMap<>(capacity,0.75f,true);
    }

    public int get(int key) {
        Integer theV = map.get(key);
        return theV==null?-1:theV;
    }

    public void put(int key, int value) {
        //首先判断key是否存在
        Integer theV = map.get(key);
        if(theV==null){
            int size = map.size();
            if(size==capacity){
                Set<Integer> keys = map.keySet();
                Integer i=null;
                for (Integer keyNum : keys) {
                    i= keyNum;
                    break;
                }
                map.remove(i);
            }
        }
        map.put(key,value);
    }
}
