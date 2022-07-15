package com.example.algorithmpractice.designproblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/27 21:36
 */
public class ceshi {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>(12,0.75f,true);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        System.out.println(map);
        map.get(1);
        System.out.println(map);
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        System.out.println(entries);
        Integer i=null;
        System.out.println("=====================");
        System.out.println(map.keySet());
        for (Map.Entry<Integer, Integer> entry : entries) {
            i= entry.getKey();
            break;
        }
        map.remove(i);
        System.out.println(map.keySet());
        System.out.println("=====================");
        System.out.println(map);
    }
}
