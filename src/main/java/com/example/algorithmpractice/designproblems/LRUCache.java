package com.example.algorithmpractice.designproblems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/27 22:37
 */
public class LRUCache {

    class DoubleList{
        int key;
        int value;
        DoubleList pre;
        DoubleList next;

        public DoubleList(){}

        public DoubleList(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    private int size;
    private int capacity;
    private Map<Integer,DoubleList> cache=new HashMap<>();
    private DoubleList head;
    private DoubleList tail;


    public LRUCache(int capacity) {
        this.capacity=capacity;
    }


    public int get(int key) {
//        System.out.println(cache.keySet());
//        System.out.println(head.key);
        DoubleList node = cache.get(key);
        if(node==null){
            return -1;
        }
        moveToHead(node);
//        System.out.println(cache.keySet());
//        System.out.println(head.key);
        return node.value;
    }

    public void put(int key, int value) {
        //首先判断cache是否存在key
        DoubleList node = cache.get(key);
        if(node==null){
            DoubleList doubleList = new DoubleList(key, value);
            cache.put(key,doubleList);
            addNode(doubleList);
            size++;
            //判断是否超过capacity
            if(size>capacity){
                DoubleList oldTail = removeTail();
                cache.remove(oldTail.key);
            }
        }else{
            node.value=value;
            moveToHead(node);
        }
    }

    private DoubleList removeTail() {
        DoubleList oldTail=tail;
        tail.pre.next=null;
        tail=tail.pre;
        size--;
        System.out.println(oldTail.key);
        return oldTail;
    }

    public void addNode(DoubleList doubleList){
        if(head==null){
            head=doubleList;
            tail=doubleList;
        }
        head.pre=doubleList;
        doubleList.next=head;
        head=doubleList;
    }

    public void moveToHead(DoubleList node){
        if(node==head){
            return;
        }else if(node==tail){
            tail.pre.next=null;
            head.pre=tail;
            tail.next=head;
            head=tail;
            tail=tail.pre;
            return;
        }else {
            node.pre.next=node.next;
            node.next.pre=node.pre;
            head.pre=node;
            node.pre=null;
            node.next=head;
            head=node;
        }

    }
}
//        2
//        1

//        3
//        2
//        4
//        4
//        4
//        4
