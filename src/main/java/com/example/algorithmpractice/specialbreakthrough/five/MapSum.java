package com.example.algorithmpractice.specialbreakthrough.five;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/11 12:41
 */
public class MapSum {
    /** Initialize your data structure here. */
    MyTrie root;
    Map<String,Integer> container=new HashMap<>();

    public MapSum() {
        root=new MyTrie();
    }

    public void insert(String key, int val) {
        Integer oldVal = container.get(key);
        container.put(key,val);
        char[] chars = key.toCharArray();
        MyTrie curTire=root;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(curTire.children[c-'a']==null){
                curTire.children[c-'a']=new MyTrie();
            }
            curTire=curTire.children[c-'a'];
            if(oldVal!=null){
                curTire.curSum-=oldVal;
            }
            curTire.curSum+=val;
            System.out.println("oldVal "+oldVal);
            System.out.println("c:"+c+" "+curTire.curSum);
        }
    }

    public int sum(String prefix) {
        int sum=0;
        MyTrie curTire=root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if(curTire.children[c-'a']==null){
                return 0;
            }
            curTire=curTire.children[c-'a'];
        }
        return curTire.curSum;
    }

}
class MyTrie{
    MyTrie[] children = new MyTrie[26];
    int curSum=0;
}
