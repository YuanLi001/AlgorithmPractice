package com.example.algorithmpractice.specialbreakthrough.third;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/12 8:17
 */
class LRUCache {

    LRUNode head,tail;
    int capacity;
    int size;
    Map<Integer,LRUNode> map;

    public LRUCache(int capacity) {
        head=new LRUNode();
        tail=new LRUNode();
        head.next=tail;
        tail.prev=head;
        this.capacity=capacity;
        size=0;
        map=new HashMap<>();
    }

    public int get(int key) {
        LRUNode lruNode = map.get(key);
        if(lruNode!=null){
            removeNode(lruNode);
            nodeToHead(lruNode);
            System.out.println(head.next.value);
            return lruNode.value;
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {

        LRUNode lruNode = map.get(key);
        if(lruNode==null){
            if(size==capacity){
//            System.out.println(tail.prev.key);
                map.remove(tail.prev.key);
                removeNode(tail.prev);

                size--;
            }
            lruNode=new LRUNode(key,value);
            map.put(key,lruNode);
            nodeToHead(lruNode);
            size++;
        }else {
            lruNode.value=value;
            removeNode(lruNode);
            nodeToHead(lruNode);
        }


    }

    public void removeNode(LRUNode node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void nodeToHead(LRUNode node){
        head.next.prev=node;
        node.next=head.next;
        head.next=node;
        node.prev=head;
    }
}
class LRUNode {
    int key;
    int value;
    LRUNode prev;
    LRUNode next;

    public LRUNode() {
    }

    public LRUNode(int key, int value, LRUNode prev, LRUNode next) {
        this.key = key;
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    public LRUNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
